package com.learn.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CdlCall {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        CountDownLatch cdl = new CountDownLatch(3);

        FutureTask<String> ft1 = new FutureTask<String>(() -> {
            Thread.sleep(2000);
            cdl.countDown();
            return "ft1 finished";
        });

        FutureTask<String> ft2 = new FutureTask<String>(() -> {
            Thread.sleep(5000);
            cdl.countDown();
            return "ft2 finished";
        });

        FutureTask<String> ft3 = new FutureTask<String>(() -> {
            Thread.sleep(3000);
            cdl.countDown();
            return "ft3 finished";
        });

        long start = System.currentTimeMillis();
        try {
            System.out.println("START...");
            es.submit(ft1);
            es.submit(ft2);
            es.submit(ft3);
            System.out.println("SUBMIT OVER..");
            cdl.await();
            long end = System.currentTimeMillis();
            System.out.println("FINISHED...");
            System.out.println(end - start);
        } catch (Exception e) {
            System.out.println("异常");
        }
    }
}
