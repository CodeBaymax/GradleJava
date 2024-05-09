package com.learn.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParalleStream {

    public static void main(String[] args) {
        para();
    }

    public static void para() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        List<Integer> newList = new ArrayList<>();

        list.parallelStream().forEach(temp -> {
            newList.add(temp);
        });

        List<Integer> succList = new ArrayList<>();

        List<Integer> synList =  Collections.synchronizedList(succList);

        list.parallelStream().forEach(temp -> {
            synList.add(temp);
        });

        System.out.println("==================");
        System.out.println(newList.size());
        System.out.println("==================");
        newList.stream().forEach(j -> {
            if (j == null) {
                System.out.println("==");
            } else {
                System.out.println(j);
            }
        });


        System.out.println("==================");
        System.out.println(succList.size());
        System.out.println("==================");
        succList.stream().forEach(j -> {
            if (j == null) {
                System.out.println("==");
            } else {
                System.out.println(j);
            }
        });

    }
}
