package com.learn.string;

public class StringSubLearn {
    public static void main(String[] args) {
        String str = "0123456";

        // 2w jiami  3w code
        System.out.println("========================");
        System.out.println(str.substring(2, str.length()));
        System.out.println(str);
        System.out.println(str.substring(0, str.length() - 2));
        System.out.println(str.substring(2));


        System.out.println(str.substring(0, 2));
        System.out.println(str.substring(str.length() - 3, str.length()));

        System.out.println(str.substring(2, str.length()-3));
        System.out.println("========================");
    }
}
