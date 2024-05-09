package com.learn.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PStream {

    static volatile List<String> newList = new ArrayList<>(1000);
//    static List<String> newList = Collections.synchronizedList(new ArrayList<>(1000));
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<String> list = new ArrayList<>();

        IntStream.range(1,1000).forEach(i -> list.add(String.valueOf(i)));
        System.out.println("listLength:" + list.size());


        list.parallelStream().forEach(str -> {
            synchronized (newList) {
                if (str.equals("2")) {
                    try {
                        Thread.currentThread().sleep(2000);
                    } catch (Exception e) {
                        System.out.println("error");
                    }
                }
                newList.add(str);
            }

        });

        System.out.println("123");
        System.out.println("length: " + newList.size());

        System.out.println("time : " + String.valueOf(System.currentTimeMillis() - start));
    }
}
