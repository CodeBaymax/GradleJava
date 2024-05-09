package com.learn.threadLocal;

public class ThreadLocalWReference {

    public static void main(String[] args) {
        test();

        final Thread thread = Thread.currentThread();
//        System.gc();
        System.out.println(thread.getName());
    }

    public static void test() {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("asd");

        System.out.println("============================");
        System.out.println(threadLocal.get());

    }
}
