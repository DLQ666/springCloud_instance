package com.dlqcloud.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: cloud01
 * @description: 远程调用接口降级实现类
 * @author: Hasee
 * @create: 2020-07-15 11:20
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
