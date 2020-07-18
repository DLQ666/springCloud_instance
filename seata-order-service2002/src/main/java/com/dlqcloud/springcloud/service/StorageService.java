package com.dlqcloud.springcloud.service;

/**
 * @description: 库存服务接口
 * @author: Hasee
 * @create: 2020-07-18 21:38
 */
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
