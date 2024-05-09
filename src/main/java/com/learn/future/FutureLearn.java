package com.learn.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureLearn {
    private static ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {
        Callable<Integer> call = () -> {
            Thread.sleep(5000);
            return 3+2;
        };

        Future<Integer> future = executor.submit(call);

        System.out.println("======================================");
        System.out.println("" + future.get());
        System.out.println("======================================");
        Future<Integer> fi = calculate(30);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println(fi.get());
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }

    public static Future<Integer> calculate(int num) {
        return executor.submit(() -> {
            Thread.sleep(5000);
            return num * num;
        });
    }

}
