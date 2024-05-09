package com.learn.sync;

import org.openjdk.jol.info.ClassLayout;

public class Sync {

    public static void main(String[] args) {
        Object obj = new Object();
//        synchronized (obj) {
//            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
//        }
        String str = ClassLayout.parseInstance(obj).toPrintable();

        System.out.println(str);
    }
}
