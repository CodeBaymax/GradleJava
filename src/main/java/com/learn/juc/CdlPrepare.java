package com.learn.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CdlPrepare {

    public static String str = "123";

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        CountDownLatch cdl = new CountDownLatch(1);

        FutureTask<String> ft1 = new FutureTask<String>(() -> {
            System.out.println(str);

            Thread.sleep(2000);
            str = "abc";
            cdl.countDown();
            System.out.println("ft1 " + System.currentTimeMillis());
            return "ft1 finished";
        });

        FutureTask<String> ft2 = new FutureTask<String>(() -> {
            cdl.await();
            System.out.println("ft2 " + System.currentTimeMillis());
            System.out.println(str);
            return "ft2 finished";
        });

        FutureTask<String> ft3 = new FutureTask<String>(() -> {
            cdl.await();
            System.out.println("ft3 " + System.currentTimeMillis());
            System.out.println(str );
            return "ft3 finished";
        });

        long start = System.currentTimeMillis();
        try {
            es.submit(ft2);
            es.submit(ft3);
            es.submit(ft1);
//            long end = System.currentTimeMillis();
            System.out.println("FINISHED...");
//            System.out.println(end - start);
        } catch (Exception e) {
            System.out.println("异常");
        }
    }
}
