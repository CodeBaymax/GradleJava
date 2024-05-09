package com.learn.collect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ListInit {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();

        Class c = Class.forName("java.util.ArrayList");
        Field field = c.getDeclaredField("elementData");
        field.setAccessible(true);

        Object[] objects = (Object[]) field.get(list);

        System.out.println("============================");
        System.out.println(objects.length);
        System.out.println("============================");
        list.add(1);
        objects = (Object[]) field.get(list);
        System.out.println(objects.length);
        System.out.println("============================");


        List<Integer> list1 = new ArrayList<>(2);
        System.out.println("-----------------------------");
        objects = (Object[]) field.get(list1);
        System.out.println(list1.size());
        System.out.println(objects.length);
        list1.add(1);
        System.out.println(list1.size());
        System.out.println("-----------------------------");
    }
}
