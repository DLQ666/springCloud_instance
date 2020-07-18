package com.dlqcloud.springcloud.service;

import com.dlqcloud.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @description: 账户服务接口
 * @author: Hasee
 * @create: 2020-07-18 20:31
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money);

}
