package com.dlqcloud.springcloud.myhanler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.dlqcloud.springcloud.entity.CommonResult;
import com.dlqcloud.springcloud.entity.Payment;

/**
 * @program: cloud01
 * @description: 自定义异常处理类
 * @author: Hasee
 * @create: 2020-07-18 15:00
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global handlerException--------1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global handlerException---------2");
    }

}
