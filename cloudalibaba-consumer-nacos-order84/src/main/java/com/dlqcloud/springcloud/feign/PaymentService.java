package com.dlqcloud.springcloud.feign;

/**
 * @description: 远程feign调用接口
 * @author: Hasee
 * @create: 2020-07-18 16:23
 */

import com.dlqcloud.springcloud.entity.CommonResult;
import com.dlqcloud.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
