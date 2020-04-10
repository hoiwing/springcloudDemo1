package com.chenma.springcloud.dao;

import com.chenma.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author: hoiwing
 * Create at: 2020-04-07 16:47:52
 * Description:
 */
@Mapper
public interface PaymentDao {

     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
