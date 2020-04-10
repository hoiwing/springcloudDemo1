package com.chenma.springcloud.service.impl;

import com.chenma.springcloud.dao.PaymentDao;

import com.chenma.springcloud.entities.Payment;
import com.chenma.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: hoiwing
 * Create at: 2020-04-07 16:57:44
 * Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
