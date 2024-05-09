package com.learn.base;

import java.util.HashMap;
import java.util.Map;

public class MapCapacity {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>(2);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getKey());
        }
    }
}
