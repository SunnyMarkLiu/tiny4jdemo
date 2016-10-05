package com.markliu.tiny4jdemo.service;

import com.markliu.tiny4j.annotation.Service;
import com.markliu.tiny4j.annotation.Transaction;

/**
 * author:sunnymarkliu
 * date  :16-9-19
 * time  :上午11:44
 */
@Service("customerService")
public class CustomerService {

    @Transaction
    public void someServiceMethod() {
        System.out.println("CustomerService someServiceMethod");
    }

}
