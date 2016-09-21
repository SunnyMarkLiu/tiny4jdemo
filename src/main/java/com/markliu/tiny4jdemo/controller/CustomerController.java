package com.markliu.tiny4jdemo.controller;

import com.markliu.tiny4j.annotation.Controller;
import com.markliu.tiny4j.annotation.Inject;
import com.markliu.tiny4j.annotation.RequestMapping;
import com.markliu.tiny4j.annotation.RequestMethod;
import com.markliu.tiny4j.http.ActionMethodParam;
import com.markliu.tiny4jdemo.service.CustomerService;

/**
 * author:sunnymarkliu
 * date  :16-9-19
 * time  :上午11:43
 */
@Controller("customerController")
@RequestMapping("/customer")
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @RequestMapping(value = "/testMethod", method = {RequestMethod.GET, RequestMethod.POST})
    public void testMethod(ActionMethodParam param) {

        System.out.println("param: " + param);
        customerService.someServiceMethod();

    }
}
