package com.hatsukoi.eshopblvd.product.service.impl;

import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageHelper;
import com.hatsukoi.eshopblvd.constant.ProductConstant;
import com.hatsukoi.eshopblvd.coupon.service.SkuFullReductionService;
import com.hatsukoi.eshopblvd.coupon.service.SpuBoundsService;
import com.hatsukoi.eshopblvd.product.dao.SpuInfoMapper;
import com.hatsukoi.eshopblvd.product.entity.*;
import com.hatsukoi.eshopblvd.product.service.*;
import com.hatsukoi.eshopblvd.product.vo.*;
import com.hatsukoi.eshopblvd.search.service.SearchRPCService;
import com.hatsukoi.eshopblvd.to.SkuHasStockVO;
import com.hatsukoi.eshopblvd.to.SkuReductionTO;
import com.hatsukoi.eshopblvd.to.SpuBoundTO;
import com.hatsukoi.eshopblvd.to.MemberPrice;
import com.hatsukoi.eshopblvd.to.es.SkuEsModel;
import com.hatsukoi.eshopblvd.utils.CommonPageInfo;
import com.hatsukoi.eshopblvd.utils.CommonResponse;
import com.hatsukoi.eshopblvd.ware.service.WareSkuRPCService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.http.HttpStatus;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author gaoweilin
 * @date 2022/03/28 Mon 3:14 AM
 */
@Slf4j
@Service
@org.apache.dubbo.config.annotation.Service
public class SpuInfoServiceImpl implements SpuInfoService {
    @Autowired
    SpuInfoMapper spuInfoMapper;

    @Autowired
    SpuInfoDescService spuInfoDescService;

    @Autowired
    SpuImagesService spuImagesService;

    @Autowired
    AttrService attrService;

    @Autowired
    ProductAttrValueService productAttrValueService;

    @Reference(check = false, interfaceName = "com.hatsukoi.eshopblvd.coupon.service.SpuBoundsService")
    SpuBoundsService spuBoundsService;

    @Autowired
    SkuInfoService skuInfoService;

    @Autowired
    SkuImagesService skuImagesService;

    @Autowired
    SkuSaleAttrValueService skuSaleAttrValueService;

    @Reference(check = false, interfaceName = "com.hatsukoi.eshopblvd.coupon.service.SkuFullReductionService")
    SkuFullReductionService skuFullReductionService;

    @Autowired
    SpuInfoService spuInfoService;

    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;

    @Reference(check = false, interfaceName = "com.hatsukoi.eshopblvd.ware.service.WareSkuRPCService")
    WareSkuRPCService wareSkuRPCService;

    @Reference(check = false, interfaceName = "com.hatsukoi.eshopblvd.search.service.SearchRPCService")
    SearchRPCService searchRPCService;

    /**
     * ??????spu????????????
     * ??????spu???????????????
     * ??????spu??????????????????sku??????
     * ??????spu???????????????
     * ??????spu???????????????
     * ????????????spu???????????????sku?????????
     * @param vo
     */
    @Override
    @Transactional
    public void insertNewSpu(SpuInsertVO vo) {
        //???1?????????spu???????????????pms_spu_info???
        SpuInfo spuInfo = new SpuInfo();
        BeanUtils.copyProperties(vo, spuInfo);
        spuInfo.setCreateTime(new Date());
        spuInfo.setUpdateTime(new Date());
        this.insertBaseSpuInfo(spuInfo);

        //???2?????????spu??????????????????pms_spu_info_desc???
        List<String> decriptImgs = vo.getDecript();
        SpuInfoDesc spuInfoDesc = new SpuInfoDesc();
        // ???????????????spu?????????????????????spuId???????????????
        spuInfoDesc.setSpuId(spuInfo.getId());
        // ????????????????????????????????????????????????
        spuInfoDesc.setDecript(String.join(",", decriptImgs));
        spuInfoDescService.insertSpuInfoDesc(spuInfoDesc);

        //???3?????????spu??????????????????sku?????????pms_spu_images???
        List<String> images = vo.getImages();
        spuImagesService.insertImages(spuInfo.getId(), images);

        //???4?????????spu??????????????????sms_spu_bounds???
        Bounds bounds = new Bounds();
        SpuBoundTO spuBoundTO = new SpuBoundTO(); // ???????????????????????????DTO
        BeanUtils.copyProperties(bounds, spuBoundTO);
        spuBoundTO.setSpuId(spuInfo.getId());
        HashMap response = spuBoundsService.insertSpuBounds(spuBoundTO);
        if ((int) response.get("code") != HttpStatus.SC_OK) {
            log.error("????????????coupon????????????spu??????????????????::spuBoundsService.insertSpuBounds()");
        }

        //???5?????????spu??????????????????pms_product_attr_value???
        List<BaseAttr> baseAttrs = vo.getBaseAttrs();
        List<ProductAttrValue> collect = baseAttrs.stream().map((baseAttr) -> {
            ProductAttrValue productAttrValue = new ProductAttrValue();
            Attr attr = attrService.getAttrById(baseAttr.getAttrId());
            productAttrValue.setAttrId(attr.getAttrId());
            productAttrValue.setAttrName(attr.getAttrName());
            // pms_attr???????????????????????????pms_product_attr_value???????????????spu?????????????????????
            productAttrValue.setAttrValue(baseAttr.getAttrValues());
            productAttrValue.setSpuId(spuInfo.getId());
            productAttrValue.setQuickShow((byte) baseAttr.getShowDesc());
            return productAttrValue;
        }).collect(Collectors.toList());
        productAttrValueService.insertProductAttrValue(collect);

        //???6???????????????spu???????????????sku?????????

        List<Sku> skus = vo.getSkus();
        if (skus != null && skus.size() > 0) {
            skus.forEach(sku -> {
                // 6.1 ??????sku??????????????????pms_sku_info???
                SkuInfo skuInfo = new SkuInfo();
                skuInfo.setSpuId(spuInfo.getId());
                skuInfo.setSkuName(sku.getSkuName());
                skuInfo.setSkuDesc(sku.getDescar().toString());
                skuInfo.setCatalogId(spuInfo.getCatalogId());
                skuInfo.setBrandId(spuInfo.getBrandId());
                String defaultImg = "";
                for (Image img: sku.getImages()) {
                    if (img.getDefaultImg() == 1) {
                        defaultImg = img.getImgUrl();
                    }
                }
                skuInfo.setSkuDefaultImg(defaultImg);
                skuInfo.setSkuTitle(sku.getSkuTitle());
                skuInfo.setSkuSubtitle(sku.getSkuSubtitle());
                skuInfo.setPrice(sku.getPrice());
                skuInfo.setSaleCount(0L);
                skuInfoService.insertSkuInfo(skuInfo);
                Long skuId = skuInfo.getSkuId();
                System.out.println("skuinfo {}" + skuInfo);

                // 6.2 ??????sku??????????????????pms_sku_image???
                List<SkuImages> skuImages = sku.getImages().stream().map(image -> {
                    SkuImages skuImage = new SkuImages();
                    skuImage.setSkuId(skuId);
                    skuImage.setDefaultImg(image.getDefaultImg());
                    skuImage.setImgUrl(image.getImgUrl());
                    return skuImage;
                }).filter(image -> {
                    // ?????????imgUrl???????????????
                    return !StringUtils.isEmpty(image.getImgUrl());
                }).collect(Collectors.toList());
                skuImagesService.batchInsert(skuImages);

                // 6.3 ??????sku????????????????????????pms_sku_sale_attr_value???
                List<SkuSaleAttrValue> skuSaleAttrValues = sku.getAttr().stream().map(saleAttr -> {
                    SkuSaleAttrValue skuSaleAttrValue = new SkuSaleAttrValue();
                    BeanUtils.copyProperties(saleAttr, skuSaleAttrValue);
                    skuSaleAttrValue.setSkuId(skuId);
                    return skuSaleAttrValue;
                }).collect(Collectors.toList());
                skuSaleAttrValueService.batchInsert(skuSaleAttrValues);

                // 6.4 ??????sku???????????????????????????????????????sms_sku_full_reduction??????sms_sku_ladder??????sms_member_price???
                SkuReductionTO skuReductionTO = new SkuReductionTO();
                skuReductionTO.setSkuId(skuId);
                skuReductionTO.setFullCount(sku.getFullCount());
                skuReductionTO.setDiscount(sku.getDiscount());
                skuReductionTO.setCountStatus(sku.getCountStatus());
                skuReductionTO.setFullPrice(sku.getFullPrice());
                skuReductionTO.setReducePrice(sku.getReducePrice());
                skuReductionTO.setPriceStatus(sku.getPriceStatus());
                List<MemberPrice> memberPriceList = sku.getMemberPrice().stream().map(item -> {
                    MemberPrice memberPrice = new MemberPrice();
                    BeanUtils.copyProperties(item, memberPrice);
                    return memberPrice;
                }).collect(Collectors.toList());
                skuReductionTO.setMemberPrice(memberPriceList);
                if (skuReductionTO.getFullCount() > 0 || skuReductionTO.getFullPrice().compareTo(new BigDecimal("0")) == 1) {
                    HashMap resp = skuFullReductionService.insertSkuReduction(skuReductionTO);
                    if ((int) resp.get("code") != HttpStatus.SC_OK) {
                        log.error("????????????coupon????????????sku??????????????????::skuFullReductionService.insertSkuReduction(skuReductionTO)");
                    }
                }
            });
        }
    }

    @Override
    public void insertBaseSpuInfo(SpuInfo spuInfo) {
        spuInfoMapper.insert(spuInfo);
    }

    /**
     *
     * @param params
     * @return
     */
    @Override
    public CommonPageInfo<SpuInfo> querySpuPage(Map<String, Object> params) {
        // ????????????
        int pageNum = 1;
        int pageSize = 10;
        // ?????????????????????
        String keyword = "";
        if (params.get("page") != null) {
            pageNum = Integer.parseInt(params.get("page").toString());
        }
        if (params.get("limit") != null) {
            pageSize = Integer.parseInt(params.get("limit").toString());
        }
        PageHelper.startPage(pageNum, pageSize);

        // select * from pms_spu_info
        // where (id = ? or spu_name like %?%) and
        // publish_status = ? and
        // brandId = ? and
        // catelogId = ?
        SpuInfoExample spuInfoExample = new SpuInfoExample();
        SpuInfoExample.Criteria criteria = spuInfoExample.createCriteria();

        // ????????????????????????
        if (params.get("key") != null) {
            keyword = params.get("key").toString();
            if (!StringUtils.isEmpty(keyword)) {
                criteria.andKeyFilter(keyword);
            }
        }

        // ???????????????????????????
        if (params.get("status") != null) {
            int status = Integer.parseInt(params.get("status").toString());
            criteria.andPublishStatusEqualTo((byte) status);
        }

        // ?????????????????????id
        if (params.get("brandId") != null) {
            Long brandId = Long.parseLong(params.get("brandId").toString());
            criteria.andBrandIdEqualTo(brandId);
        }

        // ?????????????????????id
        if (params.get("catelogId") != null) {
            Long catelogId = Long.parseLong(params.get("catelogId").toString());
            criteria.andCatalogIdEqualTo(catelogId);
        }
        List<SpuInfo> spuInfos = spuInfoMapper.selectByExample(spuInfoExample);
        return CommonPageInfo.convertToCommonPage(spuInfos);
    }

    /**
     * ????????????
     * @param spuId
     */
    @Override
    public void spuUp(Long spuId) {
        // 1 ??????SkuEsModel??????
        // 1.1 ????????????spu????????????sku???????????????(skuId, skuTitle, skuPrice, skuImg, saleCount)???pms_sku_info???
        List<SkuInfo> skus = skuInfoService.getSkusBySpuId(spuId);

        // 1.1.1 ???????????????/logo????????????
        SpuInfo spuInfo = spuInfoService.getSpuInfoBySpuId(spuId);
        Long brandId = spuInfo.getBrandId();
        Brand brand = brandService.getBrandById(brandId);
        Long catalogId = spuInfo.getCatalogId();
        Category category = categoryService.getCategoryById(catalogId);

        // 1.2 ????????????spu??????????????????????????????????????????????????????
        // 1.2.1 ??????spu??????????????????pms_product_attr_value???
        List<ProductAttrValue> baseAttrList = productAttrValueService.selectBaseAttrListForSpu(spuId);

        // 1.2.2 ??????attrId??????????????????????????????(searchType???1)???pms_attr???
        List<Long> attrIds = baseAttrList.stream().map(productAttrValue -> {
            return productAttrValue.getAttrId();
        }).collect(Collectors.toList());
        // ?????????????????????????????????????????????????????????
        // select attr_id from pms_attr where attr_id in ? and search_type = 1
        List<Long> finalAttrIds = attrService.filterAttrIds(attrIds);

        // 1.2.3 ??????List<SkuEsModel.Attrs>
        Set<Long> attrIdSet = new HashSet<>(finalAttrIds);
        List<SkuEsModel.Attrs> attrsList = baseAttrList.stream().filter(baseAttr -> {
            return attrIdSet.contains(baseAttr.getAttrId());
        }).map(baseAttr -> {
            SkuEsModel.Attrs attrs = new SkuEsModel.Attrs();
            attrs.setAttrId(baseAttr.getAttrId());
            attrs.setAttrName(baseAttr.getAttrName());
            attrs.setAttrValue(baseAttr.getAttrValue());
            return attrs;
        }).collect(Collectors.toList());

        // 1.3 ??????????????????????????????????????????????????????eshopblvd-search/wms_ware_sku???
        // ???sku -> ????????????????????????
        Map<Long, Boolean> stockMap = null;
        List<Long> skuIds = skus.stream().map(sku -> {
            return sku.getSkuId();
        }).collect(Collectors.toList());
        try {
            CommonResponse resp = CommonResponse.convertToResp(wareSkuRPCService.getSkusHasStock(skuIds));
            List<SkuHasStockVO> skuHasStockList = resp.getData(new TypeReference<List<SkuHasStockVO>>(){});
            stockMap = skuHasStockList.stream().collect(Collectors.toMap(SkuHasStockVO::getSkuId, SkuHasStockVO::getHasStock));
        } catch (Exception e) {
            log.error("???RPC???????????????sku?????????????????????{}", e);
        }


        // 1.4 ??????SkuEsModel??????
        Map<Long, Boolean> finalStockMap = stockMap;
        List<SkuEsModel> skuList = skus.stream().map(skuInfo -> {
            SkuEsModel skuEsModel = new SkuEsModel();
            skuEsModel.setSkuId(skuInfo.getSkuId());
            skuEsModel.setSpuId(spuId);
            skuEsModel.setSkuTitle(skuInfo.getSkuTitle());
            skuEsModel.setSkuPrice(skuInfo.getPrice());
            skuEsModel.setSkuImg(skuInfo.getSkuDefaultImg());
            skuEsModel.setSaleCount(skuInfo.getSaleCount());
            skuEsModel.setHasStock(finalStockMap.get(skuInfo.getSkuId()));
            // TODO: ?????????0
            skuEsModel.setHotScore(0L);
            skuEsModel.setBrandId(brandId);
            skuEsModel.setCatalogId(catalogId);
            skuEsModel.setBrandName(brand.getName());
            skuEsModel.setBrandImg(brand.getLogo());
            skuEsModel.setCatalogName(category.getName());
            skuEsModel.setAttrs(attrsList);
            return skuEsModel;
        }).collect(Collectors.toList());

        // 2 ??????????????????????????????SkuEsModel??????????????????eshopblvd-search????????????es
        System.out.println(skuList.toString());
        try {
            CommonResponse resp = CommonResponse.convertToResp(searchRPCService.productUp(skuList));
            if (resp.getCode() == HttpStatus.SC_OK) {
                SpuInfo spu = new SpuInfo();
                spu.setPublishStatus((byte) ProductConstant.StatusEnum.SPU_UP.getCode());
                spuInfoMapper.updateByPrimaryKeySelective(spu);
            }
        } catch (Exception e) {
            log.error("???RPC??????????????????????????????{}", e);
        }
    }

    /**
     * ??????spuId??????????????????
     * @param spuId
     * @return
     */
    @Override
    public SpuInfo getSpuInfoBySpuId(Long spuId) {
        SpuInfo spuInfo = spuInfoMapper.selectByPrimaryKey(spuId);
        return spuInfo;
    }
}
