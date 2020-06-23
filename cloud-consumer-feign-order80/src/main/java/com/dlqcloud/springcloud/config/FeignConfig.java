package com.dlqcloud.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud01
 * @description: 配置OpenFeign日志的配置类
 * @author: Hasee
 * @create: 2020-06-24 00:22
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
