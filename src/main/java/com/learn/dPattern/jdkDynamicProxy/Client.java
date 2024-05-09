package com.learn.dPattern.jdkDynamicProxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy(new Table1());

        ITable1 table1 = (ITable1) Proxy.newProxyInstance(proxy.getClass().getClassLoader(),
                new Class[]{ITable1.class}, proxy);

//        table1.readInfo("123");
        table1.updInfo("123");
    }
}
