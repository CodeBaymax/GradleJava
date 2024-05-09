package com.learn.future;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ComFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cFuture1 = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(2000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (1 == 1) {
                        throw new RuntimeException("ssssssss");
                    }

                    return "Future1 : " + Thread.currentThread().getName();
                }
        );

        CompletableFuture<String> cFuture2 = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "Future2 : " + Thread.currentThread().getName();
                }
        );

        CompletableFuture<Void> future = CompletableFuture.allOf(cFuture1, cFuture2);


        System.out.println(new Date());
//        future.join();
        System.out.println("cFuture1: " + cFuture1.get());
        System.out.println("cFuture2: " + cFuture2.get());
//        System.out.println("join: " + future.join());
        System.out.println(new Date());

    }
}
