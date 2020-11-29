package com.xds.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: mycloud2020
 * @description: 前端结果统一返回实例类
 * @author: xudasheng
 * @create: 2020-11-28 18:15
 **/
@Data
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
}
