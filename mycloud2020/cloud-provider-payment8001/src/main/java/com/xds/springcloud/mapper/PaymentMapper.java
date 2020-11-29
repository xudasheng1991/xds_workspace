package com.xds.springcloud.mapper;

import com.xds.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: mycloud2020
 * @description:
 * @author: xudasheng
 * @create: 2020-11-28 18:29
 **/
@Mapper
public interface PaymentMapper {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
