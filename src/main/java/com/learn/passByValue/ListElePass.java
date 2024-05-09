package com.learn.passByValue;

import com.learn.entity.CapSplit;

import java.util.ArrayList;
import java.util.List;

public class ListElePass {
    public static void main(String[] args) {
        List<CapSplit> splitList = new ArrayList<>();

        CapSplit split = new CapSplit();
        split.setId("123");

        splitList.add(split);
        System.out.println(splitList.get(0));

        split.setId("aaa");
        System.out.println(splitList.get(0));
    }

}
