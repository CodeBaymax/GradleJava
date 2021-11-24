package com.susu.threadrunnable;

public class RunStart {

    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread(() -> {
            System.out.println("new start");
            System.out.println(Thread.currentThread().getName());
//            try {
//                Thread.sleep(9000);
//            } catch (Exception e) {
//
//            }
            System.out.println("new end");
        });
        thread.run();
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//
//        }
        System.out.println("main end");
    }
}
