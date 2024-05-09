package com.learn.lambda.stu;

public class OrdinaryThread {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Anonymous");
            }
        }).start();
    }
}
