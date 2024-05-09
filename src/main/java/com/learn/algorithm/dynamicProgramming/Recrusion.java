package com.learn.algorithm.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class Recrusion {
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("================================");
        long start = System.currentTimeMillis();
        System.out.println(sum(40));
//        System.out.println(recordSum(40));
        System.out.println(System.currentTimeMillis() - start);
        System.out.println("================================");
    }

    public static int sum(int num) {
        if (num == 0) {
            return 1;
        }

        if (num <= 2) {
            return num;
        }

        return sum(num - 1) + sum(num - 2);
    }

    public static int recordSum(int num) {
        if (num == 0) {
            return 1;
        }

        if (num <= 2) {
            return num;
        }

        if (map.containsKey(num)) {
            return map.get(num);
        } else {
            int res = recordSum(num - 1) + recordSum(num - 2);
            map.put(num, res);
            return res;
        }
    }

}
