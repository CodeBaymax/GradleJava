package com.susu.threadrunnable;

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable, "thread1");
        Thread thread2 = new Thread(myRunnable, "thread2");

        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    private int ticket = 5;

    @Override
    public void run() {
        while (true) {

            synchronized (this) {
                if (this.ticket >= 1) {
                    System.out.println(Thread.currentThread().getName() + " ticket = " + ticket--);
                } else {
                    break;
                }
            }
        }
    }
}
