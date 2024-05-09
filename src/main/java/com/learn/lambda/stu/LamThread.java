package com.learn.lambda.stu;

public class LamThread {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello lambda")).start();
    }
}
