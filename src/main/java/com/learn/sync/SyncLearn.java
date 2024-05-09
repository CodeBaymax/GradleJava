package com.learn.sync;

public class SyncLearn {

    public static void main(String[] args) {
        Runnable run1 = () -> {
            int a = 0;
            for (int i = 0; i < 10; i++) {
                if (a == 3) {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        System.out.println("123");
                    }

                }
                System.out.println(a);
                a++;
            }
        };
        Runnable run2 = () -> {
            int a = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println(a);
                a++;
            }
        };
        run1.run();
        run2.run();
    }
}


