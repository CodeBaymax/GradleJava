package com.learn.generic;

import com.learn.entity.generic.Cache;

public class GenericBase {

    public static void main(String[] args) {
        Cache<String> strCache = new Cache<>();
        strCache.setValue("123");
        String str = strCache.getValue();
        // strCache.setValue(1);

        Cache<Integer> integerCache = new Cache<>();
        integerCache.setValue(1);
        int i = integerCache.getValue();
        // integerCache.setValue("123");
    }
}
