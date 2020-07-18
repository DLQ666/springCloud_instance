package com.dlqcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud01
 * @description: 主启动类
 * @author: Hasee
 * @create: 2020-07-18 15:21
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9004.class, args);
    }
}
