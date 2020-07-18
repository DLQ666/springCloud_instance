package com.dlqcloud.springcloud.controller;

import com.dlqcloud.springcloud.domain.CommonResult;
import com.dlqcloud.springcloud.domain.Storage;
import com.dlqcloud.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud01
 * @description: 库存服务前端控制器
 * @author: Hasee
 * @create: 2020-07-18 21:46
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    @PostMapping("/storage/decrease")
    public CommonResult<Storage> decrease(Long productId, Integer count){
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }

}
