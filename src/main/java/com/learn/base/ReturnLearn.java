package com.learn.base;

public class ReturnLearn {
    public static void main(String[] args) {
        one();
    }


    private static void one() {

        System.out.println("11111111111111111111");
        two();
        System.out.println("22222222222222222222");
        System.out.println("11111111111111111111");

    }

    private static void two() {
        System.out.println("===================");
        return;
    }


}
