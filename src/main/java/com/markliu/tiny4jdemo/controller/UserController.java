package com.markliu.tiny4jdemo.controller;

import com.markliu.tiny4j.annotation.Controller;
import com.markliu.tiny4j.annotation.Inject;
import com.markliu.tiny4j.annotation.RequestMapping;
import com.markliu.tiny4j.annotation.RequestMethod;
import com.markliu.tiny4j.http.ActionMethodParam;
import com.markliu.tiny4jdemo.service.UserService;

/**
 * author:sunnymarkliu
 * date  :16-9-19
 * time  :下午4:19
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {

    @Inject
    private UserService userService;

    @RequestMapping(value = "/testMethod", method = {RequestMethod.GET, RequestMethod.POST})
    public void testMethod(ActionMethodParam param) {
        System.out.println(param);
        userService.someServiceMethod();
    }
}
