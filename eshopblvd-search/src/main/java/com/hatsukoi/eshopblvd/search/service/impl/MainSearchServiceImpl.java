package com.hatsukoi.eshopblvd.search.service.impl;

import com.alibaba.fastjson.JSON;
import com.hatsukoi.eshopblvd.search.config.EshopblvdElasticSearchConfig;
import com.hatsukoi.eshopblvd.search.constant.EsConstant;
import com.hatsukoi.eshopblvd.search.service.MainSearchService;
import com.hatsukoi.eshopblvd.search.vo.SearchParam;
import com.hatsukoi.eshopblvd.search.vo.SearchResult;
import com.hatsukoi.eshopblvd.to.es.SkuEsModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.lucene.search.join.ScoreMode;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.NestedQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.nested.NestedAggregationBuilder;
import org.elasticsearch.search.aggregations.bucket.nested.ParsedNested;
import org.elasticsearch.search.aggregations.bucket.terms.ParsedLongTerms;
import org.elasticsearch.search.aggregations.bucket.terms.ParsedStringTerms;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author gaoweilin
 * @date 2022/04/23 Sat 3:10 PM
 */
@Slf4j
@Service
public class MainSearchServiceImpl implements MainSearchService {
    @Autowired
    private RestHighLevelClient client;

    @Override
    public SearchResult search(SearchParam params) {
        SearchResult result = null;
        // 1. ??????Elasticsearch????????????
        SearchRequest request = buildSearchRequest(params);
        try {
            // 2. ???Elasticsearch???????????????
            SearchResponse response = client.search(request, EshopblvdElasticSearchConfig.COMMON_OPTIONS);
            log.info("elasticsearch?????????????????????: " + response.toString());
            // 3. ??????????????????
            result = buildSearchResult(response, params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * ??????elasticsearch??????
     * @param params
     * @return
     */
    private SearchRequest buildSearchRequest(SearchParam params) {

        // ------------------ ???????????? ------------------

        // 1. ??????elasticsearch dsl??????
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();

        // 2. must-?????????????????????
        String keyword = params.getKeyword();
        if (!StringUtils.isEmpty(keyword)) {
            boolQuery.must(QueryBuilders.matchQuery("skuTitle", keyword));
        }

        // 3. ??????
        // 3.1 ???????????????????????????
        List<Long> brandIds = params.getBrandIds();
        if (brandIds != null && brandIds.size() > 0) {
            boolQuery.filter(QueryBuilders.termsQuery("brandId", brandIds));
        }
        // 3.2 ????????????????????????
        Long catalog3Id = params.getCatalog3Id();
        if (catalog3Id != null) {
            boolQuery.filter(QueryBuilders.termQuery("catalogId", catalog3Id));
        }
        // 3.3 ?????????????????????????????????????????????????????????
        List<String> attrs = params.getAttrs();
        if (attrs != null && attrs.size() > 0) {
            // ?????????????????????????????????nested??????
            // attrs=2_5???:6???&attrs=3_OLED:?????????
            for (String attr: attrs) {
                BoolQueryBuilder attrsBoolQuery = QueryBuilders.boolQuery();
                // attr=2_5???:6???
                String[] split = attr.split("_");
                // ??????id
                String attrId = split[0];
                attrsBoolQuery.must(QueryBuilders.termQuery("attrs.attrId", attrId));
                // ????????????????????????
                String[] attrValues = split[1].split(":");
                attrsBoolQuery.must(QueryBuilders.termsQuery("attrs.attrValue", attrValues));
                NestedQueryBuilder attrsNestedQuery = QueryBuilders.nestedQuery("attrs", attrsBoolQuery, ScoreMode.None);
                boolQuery.filter(attrsNestedQuery);
            }
        }
        // 3.4 ?????????????????????
        Integer hasStock = params.getHasStock();
        if (hasStock != null) {
            boolean hasStockBool = hasStock == 1;
            boolQuery.filter(QueryBuilders.termQuery("hasStock", hasStockBool));
        }
        // 3.5 ??????????????????
        String skuPriceRange = params.getSkuPrice();
        if (!StringUtils.isEmpty(skuPriceRange)) {
            RangeQueryBuilder rangeQuery = QueryBuilders.rangeQuery("skuPrice");
            String[] split = skuPriceRange.split("_");
            if (split.length == 2) {
                rangeQuery.gte(split[0]).lte(split[1]);
            } else if (split.length == 1) {
                if (skuPriceRange.startsWith("_")) {
                    rangeQuery.lte(split[1]);
                }
                if (skuPriceRange.endsWith("_")) {
                    rangeQuery.gte(split[0]);
                }
            }
            boolQuery.filter(rangeQuery);
        }
        // 3.6 ???????????????????????????????????????????????????
        searchSourceBuilder.query(boolQuery);

        // 4. ??????
        // ???????????????sort=hotScore_asc/desc
        // ???????????????sort=saleCount_asc/desc
        // ???????????????sort=skuPrice_asc/desc
        String sort = params.getSort();
        if (!StringUtils.isEmpty(sort)) {
            String[] split = sort.split("_");
            SortOrder order = split[1].equalsIgnoreCase("asc") ? SortOrder.ASC : SortOrder.DESC;
            searchSourceBuilder.sort(split[1], order);
        }

        // 5. ??????
        if (!StringUtils.isEmpty(keyword)) {
            HighlightBuilder highlightBuilder = new HighlightBuilder();
            highlightBuilder.field("skuTitle");
            highlightBuilder.preTags("<b style='color:red'>");
            highlightBuilder.postTags("</b>");
            searchSourceBuilder.highlighter(highlightBuilder);
        }

        // 6. ??????
        Integer pageNum = params.getPageNum();
        if (pageNum != null) {
            searchSourceBuilder.from((pageNum - 1) * EsConstant.PRODUCT_PAGESIZE);
            searchSourceBuilder.size(EsConstant.PRODUCT_PAGESIZE);
        }

        // ------------------ ???????????? ------------------

        // 7. ????????????
        TermsAggregationBuilder brandAgg = AggregationBuilders.terms("brandAgg").field("brandId").size(10);
        // 7.1 ?????????????????????????????????????????????????????????????????????
        brandAgg.subAggregation(AggregationBuilders.terms("brandNameAgg").field("brandName").size(1));
        brandAgg.subAggregation(AggregationBuilders.terms("brandImgAgg").field("brandImg").size(1));
        searchSourceBuilder.aggregation(brandAgg);

        // 8. ????????????
        TermsAggregationBuilder catalogAgg = AggregationBuilders.terms("catalogAgg").field("catalogId").size(10);
        // 8.1 ?????????????????????????????????????????????????????????
        catalogAgg.subAggregation(AggregationBuilders.terms("catalogNameAgg").field("catalogName").size(1));
        searchSourceBuilder.aggregation(catalogAgg);

        // 9. ????????????
        NestedAggregationBuilder attrAgg = AggregationBuilders.nested("attrAgg", "attrs");
        // 9.1 ????????????????????????attrId
        TermsAggregationBuilder attrIdAgg = AggregationBuilders.terms("attrIdAgg").field("attrs.attrId").size(10);
        // 9.2 ??????????????????attrId??????????????????
        attrIdAgg.subAggregation(AggregationBuilders.terms("attrNameAgg").field("attrs.attrName").size(1));
        // 9.3 ??????????????????attrId????????????????????????
        attrIdAgg.subAggregation(AggregationBuilders.terms("attrValueAgg").field("attrs.attrValue").size(10));
        attrAgg.subAggregation(attrIdAgg);
        searchSourceBuilder.aggregation(attrAgg);

        log.info("?????????????????????elasticsearch DSL??????" + searchSourceBuilder.toString());
        SearchRequest searchRequest = new SearchRequest(new String[]{EsConstant.PRODUCT_INDEX}, searchSourceBuilder);
        return searchRequest;
    }

    /**
     * ??????elasticsearch????????????
     * @param response
     * @return
     */
    private SearchResult buildSearchResult(SearchResponse response, SearchParam param) {
        SearchResult searchResult = new SearchResult();

        // 1. ????????????????????????????????????sku?????????????????????????????????????????????
        List<SearchResult.BrandVo> brands = new ArrayList<>();
        ParsedLongTerms brandAgg = response.getAggregations().get("brandAgg");
        for (Terms.Bucket bucket: brandAgg.getBuckets()) {
            SearchResult.BrandVo brandVo = new SearchResult.BrandVo();
            // ??????id
            long brandId = bucket.getKeyAsNumber().longValue();
            // ?????????
            String brandName = ((ParsedStringTerms) bucket.getAggregations().get("brandNameAgg")).getBuckets().get(0).getKeyAsString();
            // ?????????
            String brandImg = ((ParsedStringTerms) bucket.getAggregations().get("brandImgAgg")).getBuckets().get(0).getKeyAsString();
            brandVo.setBrandId(brandId);
            brandVo.setBrandName(brandName);
            brandVo.setBrandImg(brandImg);
            brands.add(brandVo);
        }
        searchResult.setBrands(brands);

        // 2. ????????????????????????????????????sku?????????????????????????????????????????????
        List<SearchResult.CatalogVo> catalogs = new ArrayList<>();
        ParsedLongTerms catalogAgg = response.getAggregations().get("catalogAgg");
        for (Terms.Bucket bucket: catalogAgg.getBuckets()) {
            SearchResult.CatalogVo catalogVo = new SearchResult.CatalogVo();
            // ??????id
            long catalogId = Long.parseLong(bucket.getKeyAsString());
            // ?????????
            String catalogName = ((ParsedStringTerms) bucket.getAggregations().get("catalogNameAgg")).getBuckets().get(0).getKeyAsString();
            catalogVo.setCatalogId(catalogId);
            catalogVo.setCatalogName(catalogName);
            catalogs.add(catalogVo);
        }
        searchResult.setCatalogs(catalogs);

        // 3. ????????????????????????????????????sku???????????????????????????????????????
        List<SearchResult.AttrVo> attrs = new ArrayList<>();
        ParsedNested attrAgg = response.getAggregations().get("attrAgg");
        ParsedLongTerms attrIdAgg = attrAgg.getAggregations().get("attrIdAgg");
        for (Terms.Bucket bucket: attrIdAgg.getBuckets()) {
            SearchResult.AttrVo attrVo = new SearchResult.AttrVo();
            // ??????id
            long attrId = bucket.getKeyAsNumber().longValue();
            // ?????????
            String attrName = ((ParsedStringTerms) bucket.getAggregations().get("attrNameAgg")).getBuckets().get(0).getKeyAsString();
            // ?????????
            List<String> attrValues = ((ParsedStringTerms) bucket.getAggregations().get("attrValueAgg")).getBuckets().stream().map(item -> {
                String attrValue = ((Terms.Bucket) item).getKeyAsString();
                return attrValue;
            }).collect(Collectors.toList());
            attrVo.setAttrId(attrId);
            attrVo.setAttrName(attrName);
            attrVo.setAttrValue(attrValues);
            attrs.add(attrVo);
        }
        searchResult.setAttrs(attrs);

        // 4. ????????????????????????
        SearchHits hits = response.getHits();
        List<SkuEsModel> esModels = new ArrayList<>();
        if (hits.getHits() != null && hits.getHits().length > 0) {
            for (SearchHit hit: hits.getHits()) {
                String sourceAsString = hit.getSourceAsString();
                SkuEsModel esModel = JSON.parseObject(sourceAsString, SkuEsModel.class);
                if (!StringUtils.isEmpty(param.getKeyword())) {
                    HighlightField skuTitle = hit.getHighlightFields().get("skuTitle");
                    String skuTitleStr = skuTitle.getFragments()[0].toString();
                    esModel.setSkuTitle(skuTitleStr);
                }
                esModels.add(esModel);
            }
        }
        searchResult.setProducts(esModels);

        // 5. ??????????????????
        // ??????
        searchResult.setPageNum(param.getPageNum());
        // ?????????
        long total = hits.getTotalHits().value;
        int totalPages = (int) total % EsConstant.PRODUCT_PAGESIZE == 0 ? (int) total / EsConstant.PRODUCT_PAGESIZE : ((int) total / EsConstant.PRODUCT_PAGESIZE + 1);
        searchResult.setTotalPages(totalPages);
        // ????????????
        searchResult.setTotal(total);

        return searchResult;
    }
}
