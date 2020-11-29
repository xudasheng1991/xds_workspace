package com.xds.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: mycloud2020
 * @description: Payment8001启动类
 * @author: xudasheng
 * @create: 2020-11-28 15:48
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentStarter8001 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentStarter8001.class,args);

    }
}
