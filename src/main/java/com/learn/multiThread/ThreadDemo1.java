package com.learn.multiThread;

import java.util.stream.IntStream;

public class ThreadDemo1 {

    static int data = 0;

    static int nu = 0;
    public static void main(String[] args) {
        IntStream.range(0,2).forEach(i -> System.out.println(i));

        int num = 0;
        for (int i = 0; i < 100; i++) {
            num++;
        }
        System.out.println("num : " + num);

        IntStream.range(0, 100).forEach(i -> nu++);
        System.out.println("nu : " + nu);

        System.out.println("=========================================");
        Object lock = new Object();
        IntStream.range(0,2).forEach(i -> {
            new Thread(() -> {
                try {
                    Thread.sleep(20);
                } catch (Exception e) {
                    e.printStackTrace();
                }

//                IntStream.range(0, 100).forEach(j -> data++);
                IntStream.range(0, 100).forEach(j -> {
                    synchronized (lock) {
                        data++;
                    }});
            }).start();
        });

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("data: " + data);
    }
}
