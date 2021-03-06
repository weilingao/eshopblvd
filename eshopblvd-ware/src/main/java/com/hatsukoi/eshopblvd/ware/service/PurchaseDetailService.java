package com.hatsukoi.eshopblvd.ware.service;

import com.hatsukoi.eshopblvd.utils.CommonPageInfo;
import com.hatsukoi.eshopblvd.ware.entity.PurchaseDetail;

import java.util.List;
import java.util.Map;

/**
 * @author gaoweilin
 * @date 2022/04/04 Mon 11:47 PM
 */
public interface PurchaseDetailService {
    CommonPageInfo<PurchaseDetail> queryPage(Map<String, Object> params);

    void batchUpdate(List<PurchaseDetail> collect);

    List<PurchaseDetail> selectPurchaseDetailsByIds(List<Long> purchaseIds);

    PurchaseDetail getPurchaseDetailById(Long itemId);
}
