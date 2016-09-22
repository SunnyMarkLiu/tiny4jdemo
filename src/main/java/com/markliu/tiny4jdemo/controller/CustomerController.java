package com.markliu.tiny4jdemo.controller;

import com.markliu.tiny4j.annotation.Controller;
import com.markliu.tiny4j.annotation.Inject;
import com.markliu.tiny4j.annotation.RequestMapping;
import com.markliu.tiny4j.annotation.RequestMethod;
import com.markliu.tiny4j.http.ActionMethodParam;
import com.markliu.tiny4j.http.Data;
import com.markliu.tiny4j.http.View;
import com.markliu.tiny4jdemo.model.Customer;
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
    public View testMethod(ActionMethodParam param) {

        System.out.println("param: " + param);
        customerService.someServiceMethod();
        View view = new View();
        view.setViewPath("index.jsp");
        view.setModelData(null);
        return view;
    }

    @RequestMapping(value = "/testMethodData", method = {RequestMethod.GET, RequestMethod.POST})
    public Data testMethodData(ActionMethodParam param) {

        customerService.someServiceMethod();
        Data data = new Data();
        data.setModel(new Customer("Jack", "北京市"));
        return data;
    }
}
