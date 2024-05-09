package com.learn.algorithm;

public class AlRecursion {

    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println(factorial(4));
        System.out.println("================================");
    }
}
