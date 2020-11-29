package com.xds.springcloud.service;

import com.xds.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: mycloud2020
 * @description:
 * @author: xudasheng
 * @create: 2020-11-28 22:49
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
