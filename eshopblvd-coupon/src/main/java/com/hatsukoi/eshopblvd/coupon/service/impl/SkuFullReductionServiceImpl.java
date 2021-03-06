package com.hatsukoi.eshopblvd.coupon.service.impl;

import com.hatsukoi.eshopblvd.coupon.dao.SkuFullReductionMapper;
import com.hatsukoi.eshopblvd.coupon.entity.SkuFullReduction;
import com.hatsukoi.eshopblvd.coupon.entity.SkuLadder;
import com.hatsukoi.eshopblvd.coupon.service.MemberPriceService;
import com.hatsukoi.eshopblvd.coupon.service.SkuFullReductionService;
import com.hatsukoi.eshopblvd.coupon.service.SkuLadderService;
import com.hatsukoi.eshopblvd.to.MemberPrice;
import com.hatsukoi.eshopblvd.to.SkuReductionTO;
import org.apache.http.HttpStatus;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author gaoweilin
 * @date 2022/03/29 Tue 2:06 AM
 */
@Service
@org.apache.dubbo.config.annotation.Service
public class SkuFullReductionServiceImpl implements SkuFullReductionService {
    @Autowired
    SkuFullReductionMapper skuFullReductionMapper;

    @Autowired
    SkuLadderService skuLadderService;

    @Autowired
    MemberPriceService memberPriceService;

    /**
     * 插入sku的满减「sms_sku_full_reduction」
     * 满折「sms_sku_ladder」
     * 会员价信息「sms_member_price」
     * @param reductionTo
     * @return
     */
    @Override
    public HashMap insertSkuReduction(SkuReductionTO reductionTo) {
        // sku的满减「sms_sku_full_reduction」
        SkuFullReduction skuFullReduction = new SkuFullReduction();
        BeanUtils.copyProperties(reductionTo, skuFullReduction);
        if (skuFullReduction.getFullPrice().compareTo(new BigDecimal("0")) == 1){
            skuFullReductionMapper.insert(skuFullReduction);
        }

        // 满折「sms_sku_ladder」
        SkuLadder skuLadder = new SkuLadder();
        skuLadder.setSkuId(reductionTo.getSkuId());
        skuLadder.setFullCount(reductionTo.getFullCount());
        skuLadder.setDiscount(reductionTo.getDiscount());
        skuLadder.setAddOther(reductionTo.getCountStatus() == 1 ? Boolean.TRUE : Boolean.FALSE);
        if (reductionTo.getFullCount() > 0) {
            skuLadderService.insert(skuLadder);
        }

        // 会员价信息「sms_member_price」
        List<MemberPrice> prices = reductionTo.getMemberPrice();
        List<com.hatsukoi.eshopblvd.coupon.entity.MemberPrice> memberPrices = prices.stream().map(price -> {
            MemberPrice memberPrice = new MemberPrice();
            BeanUtils.copyProperties(price, memberPrice);
            com.hatsukoi.eshopblvd.coupon.entity.MemberPrice finalMemberPrice = new com.hatsukoi.eshopblvd.coupon.entity.MemberPrice();
            finalMemberPrice.setSkuId(reductionTo.getSkuId());
            finalMemberPrice.setMemberLevelId(memberPrice.getId());
            finalMemberPrice.setMemberLevelName(memberPrice.getName());
            finalMemberPrice.setMemberPrice(memberPrice.getPrice());
            finalMemberPrice.setAddOther(Boolean.TRUE);
            return finalMemberPrice;
        }).filter(item -> item.getMemberPrice().compareTo(new BigDecimal("0")) == 1).collect(Collectors.toList());
        memberPriceService.batchInsert(memberPrices);
        HashMap res = new HashMap();
        res.put("code", HttpStatus.SC_OK);
        return res;
    }
}
