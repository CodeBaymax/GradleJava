package com.learn.SetPack;

import java.util.ArrayList;
import java.util.List;

public class ForEachList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        int i = 0;
        for (String str: list) {
            System.out.println(str + "--");
            str = str + "--";
            i++;
        }

        System.out.println(i);
        System.out.println(list.get(0));
    }
}
