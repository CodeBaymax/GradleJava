package com.learn.future;

import java.util.concurrent.CompletableFuture;

public class BaseCFuture {

    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> 1)
                .thenApply(i -> i+1)
                .thenApply(i -> i*i)
                .whenComplete((r,e) -> System.out.println(e));
    }
}
