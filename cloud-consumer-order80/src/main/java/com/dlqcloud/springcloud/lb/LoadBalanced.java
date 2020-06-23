package com.dlqcloud.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @description: 手写轮询算法接口
 * @author: Hasee
 * @create: 2020-06-23 16:54
 */
public interface LoadBalanced {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);

}
