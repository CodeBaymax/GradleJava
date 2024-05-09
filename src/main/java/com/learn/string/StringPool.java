package com.learn.string;

public class StringPool {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);

        String str3 = "hello";
        System.out.println("==" + str3 == str1);

        String str4 = str1.intern();
        System.out.println("++" + str1 == str4);

        String str5 = str1.intern();
        System.out.println(str4 == str5);
    }
}
