package com.dlqcloud.springcloud.service.impl;

import com.dlqcloud.springcloud.dao.StorageDao;
import com.dlqcloud.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud01
 * @description: 库存服务接口实现类
 * @author: Hasee
 * @create: 2020-07-18 21:40
 */
@Slf4j
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("----->storage-service扣减库存开始");
        storageDao.decrease(productId, count);
        log.info("----->storage-service扣减库存结束");
    }
}
