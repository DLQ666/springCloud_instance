package com.dlqcloud.springcloud.feign;

import com.dlqcloud.springcloud.entity.CommonResult;
import com.dlqcloud.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @program: cloud01
 * @description: 远程调用失败降级方法类
 * @author: Hasee
 * @create: 2020-07-18 16:27
 */
@Component
public class PaymentFallbackService implements PaymentService{

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，-----PaymentFallbackService ",new Payment(id,"errorSerial"));
    }

}
