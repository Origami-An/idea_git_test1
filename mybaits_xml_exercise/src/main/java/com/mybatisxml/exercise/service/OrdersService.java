package com.mybatisxml.exercise.service;

import com.mybatisxml.exercise.pojo.Orders;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
public interface OrdersService{

    /**
     * description: 根据订单id获取对应订单和商品信息。
     *
     * @param orderId 订单id
     * @return com.mybatisxml.exercise.pojo.Orders
     */
    Orders getOrderAndProductByOrderId(String orderId);

    Orders getOrderAndProductByOrderId2(String orderId);

    Orders getOrderAndProductByOrderId3(String orderId);

    Orders getOrderAndProductByOrderId4(String orderId, String ordernum);

    Orders getOrderAndProductByOrderId5(String orderId, String ordernum);

    Orders getOrderAndProductByOrderId6(String orderId, String ordernum);

    Orders getOrderAndProductByOrderId7(String orderId, String ordernum);
}
