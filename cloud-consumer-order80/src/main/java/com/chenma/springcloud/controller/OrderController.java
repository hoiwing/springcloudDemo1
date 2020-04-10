package com.chenma.springcloud.controller;

import com.chenma.springcloud.entities.CommonResult;
import com.chenma.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Author: hoiwing
 * Create at: 2020-04-08 11:34:53
 * Description:
 */
@RestController
@Slf4j
public class OrderController {
    @Resource
    RestTemplate restTemplatel;
    public static final String PAYMENT_URL = "http://localhost:8001/payment";

    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment) {
        return restTemplatel.postForObject(PAYMENT_URL + "/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        log.info("id: " + id);
        return restTemplatel.getForObject(PAYMENT_URL + "/get/" + id, CommonResult.class);
    }
}
