package com.xds.springcloud.controller;

import com.xds.springcloud.entity.CommonResult;
import com.xds.springcloud.entity.Payment;
import com.xds.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: mycloud2020
 * @description:
 * @author: xudasheng
 * @create: 2020-11-28 23:01
 **/
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private PaymentService paymentService;
    @RequestMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        log.info(payment.getSerial());
        int result = paymentService.create(payment);
        log.info("插入结果"+result);
        if (result==1){
            return new CommonResult(200,"入库成,端口号："+serverPort,result);
        }else {
            return new CommonResult(999,"入库失败",result);
        }

    }

    @RequestMapping("/getPaymentById")
    public CommonResult getPaymentById(@RequestParam(value = "id",required = false ,defaultValue = "2") Long id){
       Payment payment =  paymentService.getPaymentById(id);
       if (null!=payment){
           log.info("查询成功ss"+payment);
           return new CommonResult(200,"查询成功",payment);
       }else{
           log.info("查询失败"+payment);
           return new CommonResult(999,"查询失败",payment);
       }

    }




    @RequestMapping(value = "/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("***** element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }






}
