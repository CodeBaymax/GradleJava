package com.learn.genericNew;

import java.util.ArrayList;
import java.util.List;

public class GeDemo1 {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        List arrayList = new ArrayList();
        arrayList.add("123");
        arrayList.add(1);

        System.out.println(arrayList.get(0).getClass());

        arrayList.stream().forEach(System.out::println);
        arrayList.forEach(item -> System.out.println(item.toString()));

        arrayList.forEach(item -> System.out.println((String)item));
    }

    public static void test2() {
        List<String> arrayList = new ArrayList();
        arrayList.add("123");
//        arrayList.add(1);

        arrayList.stream().forEach(System.out::println);
    }

    public static void addRawList(List list) {
        list.add("a");
        list.add(1);
    }

    public static void addGeList(List<String> list) {
        list.add("a");
        list.add("b");
    }

    public static void test3() {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add(1);

        List<String> strList = new ArrayList<>();
        strList.add("3");
        strList.add("4");

        addGeList(list);
        addRawList(list);

        addGeList(strList);
        addRawList(strList);
    }
}
