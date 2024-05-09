package com.learn.future;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ListFuture {

    private static ExecutorService executorService = Executors.newFixedThreadPool(8);

    public static void main(String[] args) {
        List<Future<String>> futureList = new ArrayList<>();

        System.out.println(new Date());
        int i = 0;
        for (; i < 1000; i++) {
            Future<String> future = executorService.submit(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return Thread.currentThread().getName();
            });

            futureList.add(future);
        }
        System.out.println("size: " + futureList.size());
        System.out.println(new Date());
    }
}
