package com.dlqcloud.springcloud.service.impl;

import com.dlqcloud.springcloud.dao.PaymentDao;
import com.dlqcloud.springcloud.entity.Payment;
import com.dlqcloud.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @program: cloud01
 * @description: service实现类
 * @author: Hasee
 * @create: 2020-06-21 16:40
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
