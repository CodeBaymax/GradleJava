package com.learn.threadLocal;

public class MyRunnable implements Runnable {

    private ThreadLocal threadLocal = new ThreadLocal();

    @Override
    public void run() {
        threadLocal.set("threadLocal " + Math.random() * 100D);

        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println(threadLocal.get());
    }
}
