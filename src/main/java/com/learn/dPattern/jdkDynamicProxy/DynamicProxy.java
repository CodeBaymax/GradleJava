package com.learn.dPattern.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Arrays;

public class DynamicProxy implements InvocationHandler {
    private Object bean;

    public DynamicProxy(Object bean) {
        this.bean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        System.out.println("start time: "+ LocalDateTime.now());
        System.out.println("params are: ");
        Arrays.stream(args).forEach(System.out::println);

        if (methodName.equals("readInfo")) {
            System.out.println("exe read");
        } else if (methodName.equals("updInfo")) {
            System.out.println("exe upd");
        } else {
            System.out.println("exe others");
        }

        Object obj = method.invoke(bean, args);
        if (null != obj) {
            System.out.println("result is: " + obj);
        }
        System.out.println("end time: " + LocalDateTime.now());

        return obj;
    }
}
