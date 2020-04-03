package com.mybatisxml.exercise.controller;


import com.mybatisxml.exercise.pojo.Orders;
import com.mybatisxml.exercise.service.OrdersService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
@RestController
@RequestMapping("/orders")
@Api(tags = {"订单相关接口"})
public class OrdersController {

    @Autowired
    private OrdersService service;

    /**
     * description: 根据订单id获取对应订单和商品信息。
     *
     * @param orderId 订单id
     * @return com.mybatisxml.exercise.pojo.Orders
     */
    @ApiOperation(value = "根据订单id获取订单和对应商品，返回订单和对应商品信息", notes = "返回订单和对应商品信息(小标题)", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId", value = "订单id", required = true, paramType = "path", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "参数可能出现错误", response = Exception.class),
            @ApiResponse(code = 404, message = "参数路径不对", response = Exception.class)
    })
    @GetMapping("/getOrders/{orderId}")
    public Orders getOrderAndProductByOrderId(
            @ApiParam(name = "orderId", value = "订单id", required = true) @PathVariable String orderId
    ) {
        Orders order = service.getOrderAndProductByOrderId(orderId);
        return order;
    }

    @GetMapping("/getOrders2/{orderId}")
    public Orders getOrderAndProductByOrderId2(@PathVariable String orderId) {
        Orders order = service.getOrderAndProductByOrderId2(orderId);
        return order;
    }

    @GetMapping("/getOrders3/{orderId}")
    public Orders getOrderAndProductByOrderId3(@PathVariable String orderId) {
        Orders order = service.getOrderAndProductByOrderId3(orderId);
        return order;
    }

    @GetMapping("/getOrders4/{orderId}/{ordernum}")
    public Orders getOrderAndProductByOrderId4(@PathVariable String orderId, @PathVariable String ordernum) {
        Orders order = service.getOrderAndProductByOrderId4(orderId, ordernum);
        return order;
    }

    @GetMapping("/getOrders5/{orderId}/{ordernum}")
    public Orders getOrderAndProductByOrderId5(@PathVariable String orderId, @PathVariable String ordernum) {
        Orders order = service.getOrderAndProductByOrderId5(orderId, ordernum);
        return order;
    }

    @GetMapping("/getOrders6/{orderId}/{ordernum}")
    public Orders getOrderAndProductByOrderId6(@PathVariable String orderId, @PathVariable String ordernum) {
        Orders order = service.getOrderAndProductByOrderId6(orderId, ordernum);
        return order;
    }

    @ApiOperation(value = "根据订单id和订单编号获取订单和对应商品，返回订单和对应商品信息", notes = "小标题", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId", value = "订单id", required = true, dataType = "String", paramType = "path"),
            @ApiImplicitParam(name = "ordernum", value = "订单编号", required = true, dataType = "String", paramType = "path")
    })
    @ApiResponses({
            @ApiResponse(code = 404, message = "参数可能没写", response = Exception.class),
            @ApiResponse(code = 400, message = "参数错误", response = Exception.class)
    })
    @GetMapping("/getOrders7/{orderId}/{ordernum}")
    public Orders getOrderAndProductByOrderId7(@PathVariable String orderId, @PathVariable String ordernum) {
        Orders order = service.getOrderAndProductByOrderId7(orderId, ordernum);
        return order;
    }
}
