package com.dlqcloud.springcloud.service;

import com.dlqcloud.springcloud.domain.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: 库存服务接口
 * @author: Hasee
 * @create: 2020-07-18 20:32
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);

}
