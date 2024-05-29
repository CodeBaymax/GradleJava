package com.learn.dPattern.singleton;

import com.learn.dPattern.singleton.hungrySingleton.StaticVariableSingleton;

public class SingletonRun {

    public static void main(String[] args) {
        // 静态变量实现的单例
        StaticVariableSingleton singleton1 = StaticVariableSingleton.getInstance();
        StaticVariableSingleton singleton2 = StaticVariableSingleton.getInstance();
        System.out.println("======================== " + (singleton1 == singleton2));
    }
}
