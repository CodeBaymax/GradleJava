package com.learn.juc;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ComFutureCall {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "cf1 finished";
        }, es);

        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "cf2 finished";
        }, es);

        CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "cf3 finished";
        }, es);

        long start = System.currentTimeMillis();
        try {
            CompletableFuture.allOf(cf1, cf2, cf3).join();
            long end = System.currentTimeMillis();
            System.out.println("FINISHED...");
            System.out.println(end - start);
        } catch (Exception e) {
            System.out.println("异常");
        }
    }
}
