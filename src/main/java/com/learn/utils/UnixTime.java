package com.learn.utils;

import java.util.UUID;

public class UnixTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(UUID.randomUUID().toString().substring(0,6));
        Object obj = System.currentTimeMillis();
        System.out.println(obj.getClass().toString());
    }
}
