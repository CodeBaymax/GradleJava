package com.learn.topic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RearrangeTarget {

    public static void main(String[] args) {
        String str = "ilovecodingonleetcode";
        String target = "code";

        System.out.println("===========================");
        System.out.println(rearrangeCharacters(str, target));
    }

    public static int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> strMap = new HashMap<>();

        return 0;
    }

    public static int recursion(char[] target, List<Character> str, int res) {
        List<Integer> list = new ArrayList<>(target.length);

        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < str.size(); j++) {
                if (target[i] == str.get(j)) {
                    list.add(0, j);
                    break;
                } else {
                    if (j == str.size()) {
                        return res;
                    }
                }
            }

            if (i == target.length - 1) {
                res = res + 1;
                for (int k = 0; k < list.size(); k++) {
                    str.remove(list.get(k));
                }

                if (str.size() < target.length) {
                    return res;
                }
            }
        }
        return res;
    }

    public static int rearrangeCharacters1(String s, String target) {
        return 0;
    }
}
