package com.learn.reference;

import java.util.*;

public class WReference1 {

    public static void main(String[] args) {
//        normalMap();
//        weakMap();
        weakMapStrong();
    }

    public static void normalMap() {
        Map<Integer, Byte[]> map = null;

        map = new HashMap<Integer, Byte[]>(10);
        for (int i = 0; i < 10000; i++) {
            Integer integer = new Integer(i);
            map.put(integer, new Byte[i]);
        }
    }

    public static void weakMap() {
        Map<Integer, Byte[]> map = new WeakHashMap<>(10);
        for (int i = 0; i < 10000; i++) {
            Integer integer = new Integer(i);
            map.put(integer, new Byte[i]);
//            if (i == 2) {
//                System.gc();
//            }
//            if (i < 3) {
//                System.out.println("========= " + i + " " + map.get(0));
//            }
//            System.out.println("========= " + i + " " + map.get(0));
        }
    }

    public static void weakMapStrong() {
        Map<Integer, Byte[]> map =  new WeakHashMap<>(10);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            Integer integer = new Integer(i);
            map.put(integer, new Byte[i]);
            list.add(integer);
        }
    }
}
