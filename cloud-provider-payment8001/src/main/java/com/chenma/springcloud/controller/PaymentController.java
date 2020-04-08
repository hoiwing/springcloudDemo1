package com.chenma.springcloud.controller;

import com.chenma.springcloud.entities.CommonResult;
import com.chenma.springcloud.entities.Payment;
import com.chenma.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Author: hoiwing
 * Create at: 2020-04-07 17:00:06
 * Description:
 */

@Slf4j
@RestController //和 Controller 区别
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功！",result);
        } else {
            return new CommonResult(500, "插入数据库失败！");
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> findOnePaymentById(@PathVariable("id") Long id) {

        log.info("查询数据"+ id);
        Payment payment = paymentService.getPaymentById(id);
        log.info("paymentg" + payment);
        if (payment != null) {
            CommonResult<Payment> result = new CommonResult<>(200, "查询成功！", payment);
            log.info("result: " + result);
            return result;
        } else {
            log.info("没有存");
            return new CommonResult<>(500, "查询失败！没有ID: " + id);
        }
    }
}
