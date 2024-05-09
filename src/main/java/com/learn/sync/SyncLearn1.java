package com.learn.sync;

public class SyncLearn1 implements Runnable {
    private int num;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                num++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        SyncLearn1 syncLearn1 = new SyncLearn1();
        Thread th1 = new Thread(syncLearn1);
        Thread th2 = new Thread(syncLearn1);
        Thread th3 = new Thread(syncLearn1);
        Thread th4 = new Thread(syncLearn1);
        Thread th5 = new Thread(syncLearn1);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();

        Thread.sleep(5000);
        System.out.println(syncLearn1.num);
    }
}
