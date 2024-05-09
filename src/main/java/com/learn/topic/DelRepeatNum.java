package com.learn.topic;

import java.util.*;

public class DelRepeatNum {

    public static void main(String[] args) {
        method2();
    }

    public static void method1() {
        System.out.println("请输入一串整数，用空格分隔：");
        Scanner scanner = new Scanner(System.in);
        String strIn = scanner.nextLine();

        String[] strArr = strIn.split(" ");
        Map<String, String> map = new LinkedHashMap<>(strArr.length);

        for (int i = 0; i < strArr.length; i++) {
            if (!map.containsKey(strArr[i])) {
                map.put(strArr[i], strArr[i]);
            }
        }

        Set<String> set = map.keySet();
        StringBuilder sb = new StringBuilder();
        for (String str : set) {
            sb.append(str).append(" ");
        }

        System.out.println(sb.toString());
    }

    public static void method2() {
        System.out.println("请输入一串整数，用空格分隔：");
        Scanner scanner = new Scanner(System.in);
        String strIn = scanner.nextLine();

        String[] strArr = strIn.split(" ");
        Map<Integer, String> map = new HashMap<>();

        int num = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (!map.containsValue(strArr[i])) {
                map.put(num++, strArr[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
