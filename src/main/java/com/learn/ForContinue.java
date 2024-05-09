package com.learn;

import java.util.ArrayList;
import java.util.List;

public class ForContinue {

    public static void main(String[] args) {
        testContinue();
    }

    public static void testContinue() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        for (int i= 0; i < list.size(); i++) {
            System.out.println("================" + list.get(i));

            if (list.get(i) == 2) {
                continue;
            }
            System.out.println("123123123123123123123123213123");
        }

        System.out.println("++++++++++++++++++++++++++++++");

        list.stream().forEach(li -> {
            System.out.println("================" + li);
            if (li == 2) {
                return;
            }
            System.out.println("123123123123123123123123213123");
        });
    }
}
