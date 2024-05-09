package com.learn.threadLocal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.stream.IntStream;

public class SimpleDf {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd hh:mm:ss");

    public static String string = new String("");

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
            Thread.sleep(50);
            // TODO:
//            synchronized (string) {
                str = sdf.format(date);
//            }

//            str = new SimpleDateFormat("yyyyMMdd hh:mm:ss").format(date);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            return str;
        }
    }

//    public static Date getDate(int i) {
//        Date date = null;
//
//        try {
//            switch (i) {
//                case 0:
//                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20200101 00:00:00");
//                    break;
//                case 1:
//                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20210101 01:01:01");
//                    break;
//                case 2:
//                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20220202 02:02:02");
//                    break;
//                case 3:
//                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20230303 03:03:03");
//                    break;
//                case 4:
//                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20240404 04:04:04");
//                    break;
//                case 5:
//                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20250505 05:05:05");
//                    break;
//                default:
//                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20260606 06:06:06");
//            }
//        } catch (ParseException e) {
//            e.printStackTrace();
//        } finally {
//            return date;
//        }
//    }
}
