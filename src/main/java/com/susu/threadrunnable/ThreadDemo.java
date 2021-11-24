package com.susu.threadrunnable;

public class ThreadDemo {
    public static void main(String[] args) {
        new MyThread("thread1").start();
        new MyThread("thread2").start();
    }
}

class MyThread extends Thread {
    private String name;

    private int ticket = 5;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(name + " ticket = " + ticket--);
            if (ticket < 1) {
                break;
            }
        }
    }
}
