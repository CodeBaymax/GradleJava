package com.learn.lambda;

import java.util.*;

public class SetLambda {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("123|aa");
        set.add("11|bb");
        set.add("22|cc");
        set.add("33|dd");

        Map<String, String> map = new HashMap<>();

        set.forEach(ss -> {
            String[] strings = ss.split("\\|");
            map.put(strings[0], strings[1]);
        });

        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str + " -- " + map.get(str));
        }

    }
}
