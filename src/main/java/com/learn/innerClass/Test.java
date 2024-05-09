package com.learn.innerClass;

public class Test {
    public static void main(String[] args) {
        InnerClassTest test = new InnerClassTest();
        InnerClassTest test1 = new InnerClassTest();

//        InnerClassTest.InnerClass1 class1 = new InnerClassTest().InnerClass1;
        InnerClassTest.InnerClass1 class1 = test.new InnerClass1();
        InnerClassTest.InnerClass1 class12 = test1.new InnerClass1();

        InnerClassTest.InnerClass2 class2 = new InnerClassTest.InnerClass2();

        System.out.println(class1.e);
        System.out.println(class2.f);
        System.out.println(InnerClassTest.InnerClass2.g);

        System.out.println("=====================================");
        System.out.println(class1.getClass());
        System.out.println(class12.getClass());
        System.out.println("=====================================");
    }
}
