package com.learn.collect;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");

        List<String> list1 = null;
        // addAll对象不能为null
//        list.addAll(list1);

    }
}
