package com.learn.iteratorPac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        list.stream().forEach(s -> System.out.println(s));
        System.out.println("=================================");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("2")) {
                iterator.remove();
            }
        }
        list.stream().forEach(s -> System.out.println(s));
    }
}
