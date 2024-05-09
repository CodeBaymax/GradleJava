package com.learn.reference;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class ImitateThreadLocal {

    static Map<Object, String> map = new HashMap<>();
    static Map<Object, String> weakMap = new WeakHashMap<>();
    static Map<WeakReference<Object>, String> wMap = new HashMap<>();
    public static void main(String[] args) {
//        strongTest();
//        mapInfo(map);

        weakTest();
        mapInfo(weakMap);
//
//        imitateWeakTest();
//        System.out.println("1. map size: " + wMap.size());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.gc();
//        System.out.println("2. map size: " + wMap.size());
//        for (Object obj : map.keySet()) {
//            System.out.println(obj);
//        }
//
//        for (WeakReference<Object> reference : wMap.keySet()) {
//            System.out.println(reference);
//            System.out.println(reference.get());
//        }
    }

    static void mapInfo(Map<Object, String> map) {
        System.out.println("1. map size: " + map.size());
        System.gc();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(map.size());
        System.out.println("2. map size: " + map.size());

        for (Object obj : map.keySet()) {
            System.out.println(obj);
        }
        System.out.println("===============================");
    }

    static void strongTest() {
        Object obj = new Object();
        map.put(obj, "a");
        System.out.println(obj);
    }

    static void weakTest() {
        Object obj = new Object();
        weakMap.put(obj, "a");
        System.out.println(obj);
    }

    static void imitateWeakTest() {
        Object obj = new Object();
        WeakReference<Object> reference = new WeakReference<>(obj);
        wMap.put(reference, "a");

        System.out.println(obj);
        System.out.println(reference.get());
    }
}
