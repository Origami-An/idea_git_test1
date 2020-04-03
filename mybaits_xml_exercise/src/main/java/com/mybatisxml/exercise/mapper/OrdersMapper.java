package com.mybatisxml.exercise.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisxml.exercise.pojo.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
public interface OrdersMapper extends BaseMapper<Orders> {

    Orders getOrderAndProductByOrderId(String orderId);

    Orders getOrderAndProductByOrderId2(String orderId);

    Orders getOrderAndProductByOrderId3(String orderId);

    Orders getOrderAndProductByOrderId4(@Param("orderId") String orderId, @Param("orderNum") String ordernum);

    Orders getOrderAndProductByOrderId5(Map<String, String> map);

    Orders getOrderAndProductByOrderId6(String orderId, String ordernum);

    Orders getOrderAndProductByOrderId7(Orders order);
}
