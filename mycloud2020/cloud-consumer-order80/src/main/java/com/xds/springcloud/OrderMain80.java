package com.xds.springcloud;

import com.xds.Myrule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: mycloud2020
 * @description: 启动类
 * @author: xudasheng
 * @create: 2020-11-29 10:02
 **/
@SpringBootApplication
@EnableEurekaClient
//主启动类添加@RibbonClient 告诉使用MyRule算法
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = Myrule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
        System.out.println();
    }
}
