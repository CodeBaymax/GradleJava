package com.learn.dPattern.singleton.hungrySingleton;

/**
 * 饿汉式，通过静态变量的方式实现
 */
public class StaticVariableSingleton {

    private static final StaticVariableSingleton INSTANCE = new StaticVariableSingleton();

    private StaticVariableSingleton() {
    }

    public static StaticVariableSingleton getInstance() {
        return INSTANCE;
    }
}
