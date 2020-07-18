package com.dlqcloud.springcloud.service;

import com.dlqcloud.springcloud.domain.Order;

/**
 * @description: 订单服务接口
 * @author: Hasee
 * @create: 2020-07-18 20:31
 */
public interface OrderService {

    void create(Order order);
}
