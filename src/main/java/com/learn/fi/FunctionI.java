package com.learn.fi;

@FunctionalInterface
public interface FunctionI {

    void run();
//    Object clone();

    boolean equals(Object obj);

    default void out() {
        System.out.println("out");
    }

    static void in() {
        System.out.println("in");
    }
}
