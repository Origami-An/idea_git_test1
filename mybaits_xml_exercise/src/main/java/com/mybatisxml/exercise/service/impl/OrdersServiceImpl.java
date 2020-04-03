package com.mybatisxml.exercise.service.impl;

import com.mybatisxml.exercise.mapper.OrdersMapper;
import com.mybatisxml.exercise.pojo.Orders;
import com.mybatisxml.exercise.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper mapper;

    @Override
    public Orders getOrderAndProductByOrderId(String orderId) {
        Orders order = mapper.getOrderAndProductByOrderId(orderId);
        return order;
    }

    @Override
    public Orders getOrderAndProductByOrderId2(String orderId) {
        Orders order = mapper.getOrderAndProductByOrderId2(orderId);
        return order;
    }

    @Override
    public Orders getOrderAndProductByOrderId3(String orderId) {
        Orders order = mapper.getOrderAndProductByOrderId3(orderId);
        return order;
    }

    @Override
    public Orders getOrderAndProductByOrderId4(String orderId, String ordernum) {
        Orders order = mapper.getOrderAndProductByOrderId4(orderId,ordernum);
        return order;
    }

    @Override
    public Orders getOrderAndProductByOrderId5(String orderId, String ordernum) {
        Map<String,String> map = new HashMap<>();
        map.put("orderid",orderId);
        map.put("ordernum",ordernum);
        Orders order = mapper.getOrderAndProductByOrderId5(map);
        return null;
    }

    @Override
    public Orders getOrderAndProductByOrderId6(String orderId, String ordernum) {
        Orders order = mapper.getOrderAndProductByOrderId6(orderId,ordernum);
        return order;
    }

    @Override
    public Orders getOrderAndProductByOrderId7(String orderId, String ordernum) {
        Orders orderParam = new Orders();
        orderParam.setId(orderId);
        orderParam.setOrdernum(ordernum);
        Orders order = mapper.getOrderAndProductByOrderId7(orderParam);
        return order;
    }

}
