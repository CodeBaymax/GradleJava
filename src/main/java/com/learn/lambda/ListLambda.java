package com.learn.lambda;

import java.util.ArrayList;
import java.util.List;

public class ListLambda {

    public static void main(String[] args) {
        forEachRemove();
    }

    private static void forEachRemove() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);

//        list.stream().filter(li -> li > 2).forEach(c -> System.out.println(c));

//        list1.stream().forEach(li -> System.out.println(li));

        list.stream().forEach(li -> {
            if (li > 2) {
                list2.remove(li);
            }
        });

        list2.stream().forEach(li -> System.out.println(li));
    }
}
