package com.xds.springcloud.controller;

import com.xds.springcloud.entity.CommonResult;
import com.xds.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: mycloud2020
 * @description: 订单服务控制器
 * @author: xudasheng
 * @create: 2020-11-29 10:30
 **/

@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderController {
    public static final String PAYMENT_URL= "http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        log.info("payment = "+payment);
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }
    @RequestMapping("/payment/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable(value = "id") Long id){
        log.info("id= "+id);
        return restTemplate.getForObject(PAYMENT_URL+"/payment/getPaymentById/?id ="+id,CommonResult.class);
    }


}
