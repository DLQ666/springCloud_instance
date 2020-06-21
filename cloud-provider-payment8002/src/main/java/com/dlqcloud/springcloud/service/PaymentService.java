package com.dlqcloud.springcloud.service;

import com.dlqcloud.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description: service接口
 * @author: Hasee
 * @create: 2020-06-21 16:39
 */
public interface PaymentService {

    public int add(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
