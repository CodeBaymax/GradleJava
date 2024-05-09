package com.learn.string;

public class StringZero {
    public static void main(String[] args) {
        Integer num = 123;

        int zeroLength = 6 - String.valueOf(num).length();

        System.out.println("========= " + zeroLength + " ================");

        String res = String.format("%06d", num);

        System.out.println("===================");
        System.out.println("=================== " + res);
        System.out.println("===================");
    }
}
