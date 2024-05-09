package com.learn.recursion;

public class Factorial {


    public static long f(long n) {
        if (n == 1) {
            return 1;
        }

        System.out.println("+++++");
        n = n*f(n - 1);
        System.out.println("+++");
        return n;
    }

    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("+" + f(5) + "+");
        System.out.println("=============================");
    }
}
