package com.learn.innerClass;

public class InnerClassTest {

    String a = "1";
    private String b = "2";

    static String c = "3";
    private static String d = "4";

    class InnerClass1 {

        String e = "5";
//        static String h = "8";
        void test() {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }

    static class InnerClass2 {
        String f = "6";
        static String g = "7";
        void test() {
//            System.out.println(a);
//            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }

    void test() {
        InnerClassTest test = new InnerClassTest();
        InnerClass1 class1 = new InnerClass1();
    }
}
