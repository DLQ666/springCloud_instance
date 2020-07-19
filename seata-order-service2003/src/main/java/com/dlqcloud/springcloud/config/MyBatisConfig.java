package com.dlqcloud.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud01
 * @description: mybatis配置类
 * @author: Hasee
 * @create: 2020-07-18 21:04
 */
@Configuration
@MapperScan({"com.dlqcloud.springcloud.dao"})
public class MyBatisConfig {
}
