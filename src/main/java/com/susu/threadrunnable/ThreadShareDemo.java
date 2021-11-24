package com.susu.threadrunnable;

public class ThreadShareDemo {

    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();

        new Thread(thread, "thread1").start();
        new Thread(thread, "thread2").start();
    }

}

class MyThread1 extends Thread {
    private int ticket = 5;

    @Override
    public void run() {
        while (true) {
//            System.out.println(Thread.currentThread().getName() + " ticket = " + ticket--);
//            if (ticket < 1) {
//                break;
//            }
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