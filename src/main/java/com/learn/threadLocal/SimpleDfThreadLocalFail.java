package com.learn.threadLocal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.stream.IntStream;

public class SimpleDfThreadLocalFail {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
    public static ThreadLocal<SimpleDateFormat> tl = ThreadLocal.withInitial(() -> sdf);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<FutureTask<String>> list = new ArrayList<>(5);

        IntStream.range(0,5).forEach(i -> {
            FutureTask<String> futureTask = new FutureTask<>(() -> {return format(DateGet.getDate(i));});

            executorService.submit(futureTask);
            list.add(futureTask);
        });

        list.stream().forEach(ft -> {
            try {
                System.out.println(ft.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public static String format(Date date) {
        String str = null;
        try {
            Thread.sleep(5000);
            str = tl.get().format(date);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            return str;
        }
    }

}
