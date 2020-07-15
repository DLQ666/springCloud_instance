package com.dlqcloud.springcloud.dao;

import com.dlqcloud.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @description: 数据访问层接口
 * @author: Hasee
 * @create: 2020-06-21 16:20
 */
@Mapper
@Component
public interface PaymentDao {

    public int add(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
