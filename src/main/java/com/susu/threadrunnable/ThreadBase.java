package com.susu.threadrunnable;

public class ThreadBase {
    static int a;

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                a++;
                System.out.println("a = " + a);
                System.out.println("thread thread thread");
            }
        };

        Thread thread1 = new Thread(() -> {
            a++;
            System.out.println("thread thread thread");
            System.out.println("a = " + a);
        });


//        Thread thread2 = new AddFunc();
//        Thread thread3 = new AddFunc();

        Runnable runnable = new AddRunnable();
        Thread thread4 = new Thread(runnable);
        Thread thread5 = new Thread(runnable);

        thread4.start();
        thread5.start();
    }
}

class AddFunc extends Thread {
    int a = 0;

    @Override
    public void run() {
        for (int i = 0; i <= 9; i++) {
            a++;
            if (a == 2) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }

            }
            System.out.println(a);
        }
    }
}

class AddRunnable implements Runnable {
    int a = 0;

    @Override
    public void run() {
        for (int i = 0; i <= 9; i++) {
            a++;
            if (a == 2) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }

            }
            System.out.println(a);
        }
    }
}

