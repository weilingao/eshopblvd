package com.hatsukoi.eshopblvd.product.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONStreamAware;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageHelper;
import com.hatsukoi.eshopblvd.product.dao.AttrAttrgroupRelationMapper;
import com.hatsukoi.eshopblvd.product.dao.AttrGroupMapper;
import com.hatsukoi.eshopblvd.product.entity.*;
import com.hatsukoi.eshopblvd.product.service.AttrGroupService;
import com.hatsukoi.eshopblvd.product.service.AttrService;
import com.hatsukoi.eshopblvd.product.vo.AttrAttrGroupRelationVO;
import com.hatsukoi.eshopblvd.product.vo.AttrGroupWithAttrsVO;
import com.hatsukoi.eshopblvd.product.vo.SkuItemVO;
import com.hatsukoi.eshopblvd.utils.CommonPageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author gaoweilin
 * @date 2022/03/19 Sat 9:34 PM
 */
@Service
public class AttrGroupServiceImpl implements AttrGroupService {

    @Autowired
    AttrGroupMapper attrGroupMapper;

    @Autowired
    AttrAttrgroupRelationMapper attrAttrgroupRelationMapper;

    @Autowired
    AttrService attrService;

    @Override
    public CommonPageInfo<AttrGroup> queryAttrGroupPage(Map<String, Object> params, Long categoryId) {
        // 分页参数
        int pageNum = 1;
        int pageSize = 10;
        // 模糊搜索关键词
        String keyword = "";
        if (params.get("page") != null) {
            pageNum = Integer.parseInt(params.get("page").toString());
        }
        if (params.get("limit") != null) {
            pageSize = Integer.parseInt(params.get("limit").toString());
        }
        if (params.get("key") != null) {
            keyword = params.get("key").toString();
        }
        PageHelper.startPage(pageNum, pageSize);
        // select * from pms_attr_group where catelog_id=category and (attr_group_id=keyword or att_group_name like %keyword%)
        // %作为通配符替代 0 个或多个字符
        AttrGroupExample example = new AttrGroupExample();
        AttrGroupExample.Criteria criteria = example.createCriteria();
        if (categoryId != 0) {
            criteria.andCatelogIdEqualTo(categoryId);
        }
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andKeywordFilter(keyword);
        }
        List<AttrGroup> attrGroups = attrGroupMapper.selectByExample(example);
        return CommonPageInfo.convertToCommonPage(attrGroups);
    }

    @Override
    public void updateAttrGroup(AttrGroup attrGroup) {
        attrGroupMapper.updateByPrimaryKeySelective(attrGroup);
    }

    @Override
    public AttrGroup getAttrGroupById(Long attrGroupId) {
        return attrGroupMapper.selectByPrimaryKey(attrGroupId);
    }

    @Override
    public void insertAttrGroup(AttrGroup attrGroup) {
        attrGroupMapper.insert(attrGroup);
    }

    @Override
    public void deleteAttrGroupByIds(Long[] attrGroupIds) {
        AttrGroupExample example = new AttrGroupExample();
        example.createCriteria().andAttrGroupIdIn(Arrays.asList(attrGroupIds));
        attrGroupMapper.deleteByExample(example);
    }

    @Override
    public void deleteRelations(AttrAttrGroupRelationVO[] relationVOs) {
        // 根据VO来构造属性-分组的PO
        List<AttrAttrgroupRelation> relations = Arrays.asList(relationVOs).stream().map((relation) -> {
            AttrAttrgroupRelation attrAttrgroupRelation = new AttrAttrgroupRelation();
            BeanUtils.copyProperties(relation, attrAttrgroupRelation);
            return attrAttrgroupRelation;
        }).collect(Collectors.toList());
        // xml自定义dao批量删除操作
        // delete from pms_attr_attrgroup_relation where (attr_id=1 AND attr_group_id=1) or (attr_id=1 AND attr_group_id=1) or ...
        attrAttrgroupRelationMapper.batchDeleteRelations(relations);
    }

    /**
     * 根据分类id查出所有的分组以及这些分组里面的基础属性
     * @param catelogId
     * @return
     */
    @Override
    public List<AttrGroupWithAttrsVO> getAttrGroupWithAttrsByCatelogId(Long catelogId) {
        // 查询分组信息（分组表）
        AttrGroupExample example = new AttrGroupExample();
        example.createCriteria().andCatelogIdEqualTo(catelogId);
        List<AttrGroup> attrGroups = attrGroupMapper.selectByExample(example);
        // 查询这些分组的属性（属性-分组关联表）
        List<AttrGroupWithAttrsVO> collect = attrGroups.stream().map((attrGroup) -> {
            AttrGroupWithAttrsVO attrGroupWithAttrsVO = new AttrGroupWithAttrsVO();
            BeanUtils.copyProperties(attrGroup, attrGroupWithAttrsVO);
            List<Attr> relatedAttrsByAttrGroup = attrService.getRelatedAttrsByAttrGroup(attrGroup.getAttrGroupId());
            attrGroupWithAttrsVO.setAttrs(relatedAttrsByAttrGroup);
            return attrGroupWithAttrsVO;
        }).collect(Collectors.toList());
        return collect;
    }

    /**
     *
     * @param spuId
     * @param catalogId
     * @return
     */
    @Override
    public List<SkuItemVO.SpuItemAttrGroupVO> getAttrGroupWithAttrsBySpuId(Long spuId, Long catalogId) {
        // PO->VO类型强转
        List<SpuItemAttrGroupPO> groupAttrs = attrGroupMapper.getAttrGroupWithAttrsBySpuId(spuId, catalogId);
        List<SkuItemVO.SpuItemAttrGroupVO> spuItemAttrGroupVOs = JSON.parseObject(JSON.toJSONString(groupAttrs), new TypeReference<List<SkuItemVO.SpuItemAttrGroupVO>>() {
        });
        return spuItemAttrGroupVOs;
    }
}