package com.learn.instantiationAndInitialization;

public class Test {
    static {
        System.out.println("this is test static");
    }

    public Test() {
        System.out.println("this is test constructor");
    }
}
