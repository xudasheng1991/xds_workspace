package com.xds.springcloud.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: mycloud2020
 * @description: Payment实体类
 * @author: xudasheng
 * @create: 2020-11-28 18:11
 **/
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
