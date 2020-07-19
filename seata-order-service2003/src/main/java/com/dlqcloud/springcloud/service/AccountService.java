package com.dlqcloud.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @program: cloud01
 * @description: 账户服务接口
 * @author: Hasee
 * @create: 2020-07-19 11:30
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money);
}
