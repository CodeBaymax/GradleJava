package com.learn.classLoader;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception {
        String codePath = "D:\\data\\";
        MyClassLoader classLoader = new MyClassLoader(codePath);

        Class<?> clazz = classLoader.loadClass("Compute");
        System.out.println("===============================");
        System.out.println("字节码由 " + clazz.getClassLoader().getClass().getName() + " 加载。。。");
        System.out.println("父加载器为 " + clazz.getClassLoader().getParent().getClass().getName());
        System.out.println("===============================");

        Object o = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("add", Integer.class, Integer.class);
        method.invoke(o, 1, 2);
    }
}
