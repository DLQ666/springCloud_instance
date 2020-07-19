package com.dlqcloud.springcloud.controller;

import com.dlqcloud.springcloud.domain.Account;
import com.dlqcloud.springcloud.domain.CommonResult;
import com.dlqcloud.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @program: cloud01
 * @description: 账户服务前端控制器
 * @author: Hasee
 * @create: 2020-07-19 11:37
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult<Account> decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId, money);
        return new CommonResult(200,"扣减账户余额成功！");
    }

}
