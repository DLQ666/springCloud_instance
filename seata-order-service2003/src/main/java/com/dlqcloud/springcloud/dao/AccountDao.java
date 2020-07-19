package com.dlqcloud.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @description: 账户dao接口
 * @author: Hasee
 * @create: 2020-07-19 11:18
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);
}
