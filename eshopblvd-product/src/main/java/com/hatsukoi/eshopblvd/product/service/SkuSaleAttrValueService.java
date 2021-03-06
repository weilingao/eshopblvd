package com.hatsukoi.eshopblvd.product.service;

import com.hatsukoi.eshopblvd.product.entity.SkuSaleAttrValue;
import com.hatsukoi.eshopblvd.product.entity.SpuSaleAttrPO;
import com.hatsukoi.eshopblvd.product.vo.SkuItemVO;

import java.util.List;

/**
 * @author gaoweilin
 * @date 2022/03/29 Tue 1:40 AM
 */
public interface SkuSaleAttrValueService {
    void batchInsert(List<SkuSaleAttrValue> skuSaleAttrValues);

    List<SpuSaleAttrPO> getSaleAttrsBySpuId(Long spuId);
}
