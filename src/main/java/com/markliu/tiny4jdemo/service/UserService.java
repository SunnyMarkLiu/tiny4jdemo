package com.markliu.tiny4jdemo.service;

import com.markliu.tiny4j.annotation.Service;

/**
 * author:sunnymarkliu
 * date  :16-9-19
 * time  :下午4:19
 */
@Service("userService")
public class UserService {

    public void someServiceMethod() {
        System.out.println("UserService someServiceMethod");
    }

}