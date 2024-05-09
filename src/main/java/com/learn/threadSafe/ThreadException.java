package com.learn.threadSafe;

public class ThreadException {

    public static void main(String[] args) {
        System.out.println("主线程 -- 开始");
        // 1. 直接try catch不会获取子线程的异常
//        tcNoEffect();

        // 2. 子线程中直接try catch
//        subThreadException();

        // 3. 设置UncaughtExceptionHandler，子线程异常处理
        setExcHandler();

        System.out.println("主线程 -- 结束");
    }

    /**
     * 直接try catch不会捕获子线程中异常
     */
    public static void tcNoEffect() {
        try {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " -- subThread start");
                throw new RuntimeException("subThread Exception");
            }).start();
        } catch (Exception e) {
            System.out.println("主线程 catch a Exception");
        }
    }

    /**
     * 子线程中try catch
     */
    public static void subThreadException() {

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " -- subThread start");
            try {
                throw new RuntimeException("subThread exception");
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + " -- subThread exception catched");
                System.out.println(Thread.currentThread().getName() + " " + e);
            }
            System.out.println(Thread.currentThread().getName() + " -- subThread end");
        }).start();
    }

    /**
     * 设置UncaughtExceptionHandler，来对子线程中的异常进行处理
     */
    public static void setExcHandler() {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " -- subThread start");
            try {
                throw new RuntimeException("subThread Exception");
            } catch (Exception e) {
                System.out.println("111111111111111111111111111");
                throw e;
            }

        }, "th1");
        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println(Thread.currentThread().getName() + " -- handler catch a Exception");
            System.out.println("thread : " + t.getName() + "发生异常： " + e);
//            throw new RuntimeException("subThread ExceptionHandler");
        });

        try {
            thread.start();
        } catch (Exception e) {
            System.out.println("主线程 catch subThread Exception");
        }

        // 设置全局默认UncaughtExceptionHandler
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {

        });
    }
}
