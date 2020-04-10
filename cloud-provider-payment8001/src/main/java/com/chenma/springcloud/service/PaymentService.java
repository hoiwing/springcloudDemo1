package com.chenma.springcloud.service;

import com.chenma.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Author: hoiwing
 * Create at: 2020-04-07 16:56:56
 * Description:
 */
public interface PaymentService {
     public int create(Payment payment);

     public Payment getPaymentById(@Param("id") Long id);
}
