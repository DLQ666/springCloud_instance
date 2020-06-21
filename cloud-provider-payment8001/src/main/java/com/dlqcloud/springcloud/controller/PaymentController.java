package com.dlqcloud.springcloud.controller;

import com.dlqcloud.springcloud.entity.CommonResult;
import com.dlqcloud.springcloud.entity.Payment;
import com.dlqcloud.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import sun.plugin.com.DispatchClient;

import java.util.List;

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

    @Autowired
    private DiscoveryClient discoveryClient;

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

    @GetMapping("/payment/discovery")
    public Object discoery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("******element: "+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

}
