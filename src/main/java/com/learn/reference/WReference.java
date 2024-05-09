package com.learn.reference;

import java.lang.ref.WeakReference;

public class WReference {

    static WeakReference<String> weakReference;
    public static void main(String[] args) {
        test();

        System.out.println("3. WeakReference get: " + weakReference.get());

        System.gc();
//        System.out.println("===================== " + weakReference);

        System.out.println("4. WeakReference get: " + weakReference.get());
    }

    public static void test() {
        String str = new String("abc");
//        System.out.println("===================== " + weakReference);

        weakReference = new WeakReference<>(str);

        System.out.println("1. WeakReference get: " + weakReference.get());
        System.gc();
        System.out.println("2. WeakReference get: " + weakReference.get());
    }
}
