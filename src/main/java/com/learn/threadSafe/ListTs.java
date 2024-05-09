package com.learn.threadSafe;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListTs {

    public static void main(String[] args) {
        // 1. 正常PStream用法
//        pStream();
//        stringListMod();

        // 2. pStreamErr，List存在线程安全问题
        List<String> list = new ArrayList<>();
        IntStream.range(0, 1000).forEach(i -> list.add(String.valueOf(i)));

        pStreamErr(list);
    }

    /**
     * PStream无线程安全问题
     */
    public static void pStream() {
//        List<MSG> list = new ArrayList<>();
//        IntStream.range(0,10).forEach(i -> {
//            MSG msg = new MSG();
//            msg.setMsg(String.valueOf(i));
//            list.add(msg);
//        });
//
//        System.out.println("size: " + list.size());
//        System.out.println(list.get(0).getMsg());
//        System.out.println(list.get(1).getMsg());
//        System.out.println("====================================");
//        list.parallelStream().forEach(msg -> {
//            msg.setMsg("a" + msg.getMsg());
//        });
//        System.out.println(list.get(0).getMsg());
//        System.out.println(list.get(1).getMsg());
//
        List<String> strList = new ArrayList<>();
        IntStream.range(0, 1000).forEach(i -> {
            strList.add(String.valueOf(i));
        });
//        IntStream.range(0, 10).forEach(i -> {
//            strList.add(String.valueOf(i));
//        });

        System.out.println(LocalDateTime.now());
        strList.parallelStream().forEach(str -> {
//            int x = 1 + 1;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(LocalDateTime.now());

        strList.stream().forEach(str -> {
//            int x = 1 + 1;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(LocalDateTime.now());
    }

    public static void stringListMod() {
        List<String> strList = new ArrayList<>();
        IntStream.range(0, 1000).forEach(i -> {
            strList.add(String.valueOf(i));
        });

        System.out.println(LocalDateTime.now());
        List<String> newList = strList.parallelStream().map(str -> "a" + str).collect(Collectors.toList());
        System.out.println(LocalDateTime.now());
        System.out.println(newList.get(0));

        strList.stream().map(str -> "a" + str).collect(Collectors.toList());
        System.out.println(LocalDateTime.now());
    }

    public static void pStreamErr(List<String> list) {
//        List<String> newList = new ArrayList<>(1000);
        List<String> newList = new ArrayList<>();

        System.out.println("list size: " + list.size());
        list.parallelStream().forEach(str -> {
//            synchronized (list) {
                newList.add(str);
//            }
        });

        System.out.println("newList size: " + newList.size());

//        try{
//
//            Field element = newList.getClass().getDeclaredField("elementData");
//            element.setAccessible(true);
//
//            Object[] obj = (Object[]) element.get(newList);
//            System.out.println("element size: " + obj.length);
//            System.out.println(obj[newList.size()]);
//            System.out.println(obj[newList.size() - 1]);
//        } catch (Exception e) {
//
//        }
    }

    public static void pStreamTs(List<String> list) {

    }
}
