package com.learn.threadSafe;

import java.util.concurrent.*;

public class ThreadPoolException {

    public static void main(String[] args) {
        System.out.println("主线程 开始");

//        executeExc();

//        try {
//            Thread.sleep(10000);
//        } catch (Exception e) {
//            System.out.println("======================");
//        }

//        try {
//            executeExc();
//        } catch (Exception e) {
//            System.out.println("主线程 catch到子线程异常");
//        }

//        executeEh();

        submitNoGet();

//        submitGet();
        System.out.println("主线程 结束");
    }

    // execute添加的线程，堆栈中可以看到异常信息
    public static void executeExc() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(() -> {
            System.out.println("subThread start");
            throw new RuntimeException("subThread Exception");
        });
    }

    // 通过ThreadGroup ExceptionHandler处理子线程异常
    public static void executeEh() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // 设置ThreadGroup  UncaughtExceptionHandler
        ThreadGroupSub tg = new ThreadGroupSub("threadGroup1");
        Thread.UncaughtExceptionHandler handler = (t, e) -> {
            System.out.println("Thread Group UncaughtExceptionHandler");
        };
        tg.setUncaughtExceptionHandler(handler);

        Thread thread = new Thread(tg, () -> {
            System.out.println("123");
            throw new RuntimeException("subThread Exception");
        });

        // 设置Thread的UncaughtExceptionHandler
//        Thread thread = new Thread(() -> {
//            Thread.currentThread().setUncaughtExceptionHandler((t,e) -> {
//                System.out.println("UncaughtExceptionHandler");
//            });
//            System.out.println("123");
//            throw new RuntimeException("subThread Exception");
//        });


        executorService.execute(thread);

        System.out.println("456");

    }

    // submit添加的线程，堆栈中无法看到异常信息
    public static void submitNoGet() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            System.out.println("subThread start");
            throw new RuntimeException("subThread Exception");
        });
    }

    public static void submitGet() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            System.out.println("subThread start");
            Thread.sleep(3000);
            if (1 == 1){
                throw new RuntimeException("subThread Exception");
            }

            return "aaa";
        });

        System.out.println("subThread ...");

        try {
            future.get(2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            System.out.println("=================");
            System.out.println(e.getMessage());
        } catch (ExecutionException e) {
            System.out.println("-----------------");
            System.out.println(e.getMessage());
        } catch (TimeoutException e) {
            System.out.println("#################");
            e.printStackTrace();
        }
    }

    static class ThreadGroupSub extends ThreadGroup {
        private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

        public ThreadGroupSub(String name) {
            super(name);
        };

        public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
            return this.uncaughtExceptionHandler;
        }
        public void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.uncaughtExceptionHandler = uncaughtExceptionHandler;
        }

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            if (this.uncaughtExceptionHandler != null)
                this.uncaughtExceptionHandler.uncaughtException(t, e);
            else
                super.uncaughtException(t, e);
        }
    }
}
