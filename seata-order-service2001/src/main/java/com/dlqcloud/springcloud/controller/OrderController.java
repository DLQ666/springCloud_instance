package com.dlqcloud.springcloud.controller;

import com.dlqcloud.springcloud.domain.CommonResult;
import com.dlqcloud.springcloud.domain.Order;
import com.dlqcloud.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: cloud01
 * @description: 订单模块前端控制器
 * @author: Hasee
 * @create: 2020-07-18 20:59
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult<Order> create(Order order){
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");

    }
}
