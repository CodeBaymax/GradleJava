package com.learn.juc;

import java.util.concurrent.*;

public class CbCal {
    static CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("哥几个都算完了，看看谁来执行的 " + Thread.currentThread().getName());
        }
    });

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        testFt();
//        testCallable();
    }

    public static void testFt() throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        FutureTask<Integer> ft1 = new FutureTask<>(() -> {
            System.out.println(Thread.currentThread().getName() + " 我正在努力读取第一个文件...");
            System.out.println(Thread.currentThread().getName() + " 我大概读到了10000条数据，可能需要计算好长时间...");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " 我好像算完了，不知道另外两个sb是不是也算完了，我等等他俩吧...");
            System.out.println(Thread.currentThread().getName() + " 看看有几个已经到了 " + cb.getNumberWaiting());
            cb.await();
            System.out.println(Thread.currentThread().getName() + " 看看有几个在等待 " + cb.getNumberWaiting());
            System.out.println(Thread.currentThread().getName() + " 哥三都执行完了");
            return 100;
        });

        FutureTask<Integer> ft2 = new FutureTask<>(() -> {

            System.out.println(Thread.currentThread().getName() + " 我正在努力读取第二个文件...");
            System.out.println(Thread.currentThread().getName() + " 我大概读到了20000条数据，可能需要计算好长时间...");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " 我好像算完了，不知道另外两个sb是不是也算完了，我等等他俩吧...");
            System.out.println(Thread.currentThread().getName() + " 看看有几个已经到了 " + cb.getNumberWaiting());
            cb.await();
            System.out.println(Thread.currentThread().getName() + " 哥三都执行完了");
            return 200;
        });

        FutureTask<Integer> ft3 = new FutureTask<>(() -> {
            System.out.println(Thread.currentThread().getName() + " 我正在努力读取第三个文件...");
            System.out.println(Thread.currentThread().getName() + " 我大概读到了30000条数据，可能需要计算好长时间...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " 我好像算完了，我估计我就是别人口中的sb...");
            System.out.println(Thread.currentThread().getName() + " 看看有几个已经到了 " + cb.getNumberWaiting());
            cb.await();
            System.out.println(Thread.currentThread().getName() + " 哥三都执行完了");
            return 300;
        });

        es.submit(ft1);
        Thread.sleep(1000);
        es.submit(ft2);
        Thread.sleep(1000);
        es.submit(ft3);

//        es.submit(ft1);
//        es.submit(ft2);
//        es.submit(ft3);
        es.shutdown();
    }

    public static void testCallable() throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        Callable<Integer> ft1 = () -> {
            System.out.println(Thread.currentThread().getName() + " 我正在努力读取第一个文件...");
            System.out.println(Thread.currentThread().getName() + " 我大概读到了10000条数据，可能需要计算好长时间...");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " 我好像算完了，不知道另外两个sb是不是也算完了，我等等他俩吧...");
            System.out.println(Thread.currentThread().getName() + " 看看有几个已经到了 " + cb.getNumberWaiting());
            cb.await();
            System.out.println(Thread.currentThread().getName() + " 哥三都执行完了");
            return 100;
        };

        Callable<Integer> ft2 = () -> {

            System.out.println(Thread.currentThread().getName() + " 我正在努力读取第二个文件...");
            System.out.println(Thread.currentThread().getName() + " 我大概读到了20000条数据，可能需要计算好长时间...");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " 我好像算完了，不知道另外两个sb是不是也算完了，我等等他俩吧...");
            System.out.println(Thread.currentThread().getName() + " 看看有几个已经到了 " + cb.getNumberWaiting());
            cb.await();
            System.out.println(Thread.currentThread().getName() + " 哥三都执行完了");
            return 200;
        };

        Callable<Integer> ft3 = () -> {
            System.out.println(Thread.currentThread().getName() + " 我正在努力读取第三个文件...");
            System.out.println(Thread.currentThread().getName() + " 我大概读到了30000条数据，可能需要计算好长时间...");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " 我好像算完了，我估计我就是别人口中的sb...");
            System.out.println(Thread.currentThread().getName() + " 看看有几个已经到了 " + cb.getNumberWaiting());
            cb.await();
            System.out.println(Thread.currentThread().getName() + " 哥三都执行完了");
            return 300;
        };

        es.submit(ft1);
        Thread.sleep(1000);
        es.submit(ft2);
        Thread.sleep(1000);
        es.submit(ft3);
        Thread.sleep(1000);
        es.submit(ft1);
        es.submit(ft2);
        es.submit(ft1);
        es.shutdown();
    }
}
