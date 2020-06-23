package com.dlqcloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud01
 * @description: ribbon自定义规则类，防止主启动类自带componentscan扫描到此包导致所有ribbon客户端运用此规则
 * @author: Hasee
 * @create: 2020-06-23 16:26
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }
}
