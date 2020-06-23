package com.dlqcloud.springcloud.controller;

import com.dlqcloud.springcloud.entity.CommonResult;
import com.dlqcloud.springcloud.entity.Payment;
import com.dlqcloud.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @program: cloud01
 * @description: 控制器类
 * @author: Hasee
 * @create: 2020-06-21 16:43
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/add")
    public CommonResult add(@RequestBody Payment payment) {
        int result = paymentService.add(payment);
        log.info("****插入结果: " + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort: "+serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果: " + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort: "+serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID：" + id, null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

}
