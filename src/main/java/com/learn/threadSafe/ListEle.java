package com.learn.threadSafe;

import java.util.ArrayList;

public class ListEle {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);

        for (int i = 0; ; i++) {
            if (list.size() > 5) {
                break;
            }
            list.add(i);
//            System.out.println(list.get);
        }
    }
}
