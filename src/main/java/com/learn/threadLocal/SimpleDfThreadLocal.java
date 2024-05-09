package com.learn.threadLocal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.stream.IntStream;

public class SimpleDfThreadLocal {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
    public static ThreadLocal<SimpleDateFormat> tl = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd hh:mm:ss"));

    public static ThreadLocal<String> tl1 = ThreadLocal.withInitial(() -> "test");

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();

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
        SimpleDateFormat sdf1 = tl.get();
//        String strTest = tl1.get();
        str = sdf1.format(date);
        tl.remove();
        return str;
    }
}