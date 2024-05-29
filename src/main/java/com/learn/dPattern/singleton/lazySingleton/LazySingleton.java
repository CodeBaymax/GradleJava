package com.learn.dPattern.singleton.lazySingleton;

/**
 * 懒汉式
 */
public class LazySingleton {

    private static volatile LazySingleton INSTANCE;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (null == INSTANCE) {
            synchronized (LazySingleton.class) {
                if (null == INSTANCE) {
                    INSTANCE = new LazySingleton();
                }
            }
        }

        return INSTANCE;
    }
}
