package com.learn.bool;

public class TypeOfBool {
    public static void main(String[] args) throws Exception {
        Boolean b = true;

        System.out.println("b is " + b);

        System.out.println("====================================");

        Thread.sleep(30000);

        setBool(b);
        System.out.println("b is " + b);
    }

    public static void setBool(Boolean b) {
        b = false;
    }

}
