package com.learn.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureTaskLearn {
    private static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws Exception {

        String str = new String("123");
        Runnable runnable = () -> {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println(Thread.currentThread().getName());
//            str = "12345";
        };

//        runnable.run();

        Callable<String> callable = Executors.callable(runnable, str);
        FutureTask futureTask = new FutureTask(callable);

        executorService.submit(futureTask);

        while (futureTask.get() != null) {
            System.out.println(futureTask.get());
            break;
        }


        Callable<String> callable1 = () -> {
            return "abc";
        };

        FutureTask<String> futureTask1 = new FutureTask<>(callable1);

        executorService.submit(futureTask1);
        System.out.println(futureTask1.get());
    }
}
