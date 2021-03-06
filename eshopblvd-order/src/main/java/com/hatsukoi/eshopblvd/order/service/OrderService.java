package com.hatsukoi.eshopblvd.order.service;

import com.alipay.api.AlipayApiException;
import com.hatsukoi.eshopblvd.order.entity.Order;
import com.hatsukoi.eshopblvd.order.vo.*;
import com.hatsukoi.eshopblvd.to.SeckillOrderTo;
import com.hatsukoi.eshopblvd.utils.CommonPageInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * @author gaoweilin
 * @date 2022/05/09 Mon 1:25 AM
 */
public interface OrderService {
    OrderConfirmVO getOrderConfirmData(Long addrId) throws ExecutionException, InterruptedException;

    Order submitOrder(OrderSubmitVO orderSubmit);

    void closeOrder(Order order);

    PayVo buildPayData(String orderSn);

    CommonPageInfo<OrderVo> getOrderList(Map<String, Object> params);

    void handleAlipay(PayAsyncVo pay, HttpServletRequest request) throws AlipayApiException;

    void createSeckillOrder(SeckillOrderTo seckillOrder);
}
