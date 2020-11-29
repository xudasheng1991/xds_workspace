package com.xds.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mycloud2020
 * @description:
 * @author: xudasheng
 * @create: 2020-11-28 23:14
 **/
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name",required = false,
            defaultValue = "China") String name){
        return  "hello "+name;
    }
}
