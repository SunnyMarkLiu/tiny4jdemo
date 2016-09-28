package com.markliu.tiny4jdemo.aspect;

import com.markliu.tiny4j.annotation.Controller;
import com.markliu.tiny4j.aop.Aspect;
import com.markliu.tiny4j.aop.AspectProxy;

import java.lang.reflect.Method;

/**
 * author:sunnymarkliu
 * date  :16-10-1
 * time  :下午1:55
 */
@Aspect(Controller.class)
public class ServiceAspect extends AspectProxy {

    @Override
    protected void beginProxy(Class<?> targetClass, Object targetObject, Method targetMethod, Object[] methodParams) {
        System.out.println("ServiceAspect beginProxy..." + targetMethod.getName());
    }

    @Override
    protected void beforeProxy(Class<?> targetClass, Object targetObject, Method targetMethod, Object[] methodParams) {
        System.out.println("ServiceAspect beforeProxy..." + targetMethod.getName());
    }

    @Override
    protected void afterProxy(Class<?> targetClass, Object targetObject, Method targetMethod, Object[] methodParams, Object result) {
        System.out.println("ServiceAspect afterProxy..." + targetMethod.getName());
    }

    @Override
    protected void endProxy(Class<?> targetClass, Object targetObject, Method targetMethod, Object[] methodParams, Object result) {
        System.out.println("ServiceAspect endProxy..." + targetMethod.getName());
    }

    @Override
    protected void error(Class<?> targetClass, Object targetObject, Method targetMethod, Object[] methodParams) {
        System.out.println("ServiceAspect error..." + targetMethod.getName());
    }
}
