package com.learn.fi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunc {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("a", "aa", "aaa", "aaaa");
        Predicate<String> pre = str -> str.length() > 2;
        List<String> resList = strList.stream().filter(pre).collect(Collectors.toList());
        System.out.println(resList.size());

        if (pre.test("123")) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }
    }
}
