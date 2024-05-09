package com.learn.threadSafe;

public class Test {
    public static void main(String[] args) {
//        Object[] objects = new Object[5];
//        int i = 0;
//        i++;
//        System.out.println(i);

        String[] strings = new String[5];
        int i = 0;
        strings[i++] = "a";

        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(i);
    }
}
