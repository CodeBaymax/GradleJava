package com.learn.topic;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // "(name)is(age)yearsold"
        // [["name","bob"],["age","two"]]

        List<String> list1 = Arrays.asList(new String[]{"name", "bob"});
        List<String> list2 = Arrays.asList(new String[]{"age","two"});

        List<List<String>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);

        System.out.println(evaluate("(name) is (age) yearsold", list));
    }

    public static String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<String, String>();

        if (knowledge.size() != 0) {
            for (List<String> str : knowledge) {
                if (str.size() == 0) {
                    continue;
                }
                map.put(str.get(0), str.get(1));
            }
        }

        return repl(s, map);
    }

    public static String repl(String str, Map<String, String> map) {
        int start = str.indexOf("(");
        int end = str.indexOf(")");

        if (-1 == end) {
            return str;
        }

        String key = str.substring(start + 1, end);
        String value = map.get(key);

        if (null == value || "" == value) {
            str = str.replace("(" + key + ")", "?");
        } else {
            str = str.replace("(" + key + ")", value);
        }

        return repl(str, map);
    }

    public static String evaluate1(String s, List<List<String>> knowledge) {
        Map<String, String> mp = new HashMap<>();

        for (List<String> t : knowledge)
            mp.put(t.get(0), t.get(1));

        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                StringBuilder tem = new StringBuilder();
                while (arr[++i] != ')')
                    tem.append(arr[i]); //截取()之间的字符
                sb.append(mp.getOrDefault(tem.toString(), "?")); //若不存在添加?
            } else
                sb.append(arr[i]);
        }
        return sb.toString();
    }
}

/**
 * 给你一个字符串 s ，它包含一些括号对，每个括号中包含一个 非空 的键。
 *
 * 比方说，字符串 "(name)is(age)yearsold" 中，有 两个 括号对，分别包含键 "name" 和 "age" 。
 * 你知道许多键对应的值，这些关系由二维字符串数组 knowledge 表示，其中 knowledge[i] = [keyi, valuei] ，表示键 keyi 对应的值为 valuei 。
 *
 * 你需要替换 所有 的括号对。当你替换一个括号对，且它包含的键为 keyi 时，你需要：
 *
 * 将 keyi 和括号用对应的值 valuei 替换。
 * 如果从 knowledge 中无法得知某个键对应的值，你需要将 keyi 和括号用问号 "?" 替换（不需要引号）。
 * knowledge 中每个键最多只会出现一次。s 中不会有嵌套的括号。
 *
 * 请你返回替换 所有 括号对后的结果字符串
 *
 * 示例 1：
 *
 * 输入：s = "(name)is(age)yearsold", knowledge = [["name","bob"],["age","two"]]
 * 输出："bobistwoyearsold"
 * 解释：
 * 键 "name" 对应的值为 "bob" ，所以将 "(name)" 替换为 "bob" 。
 * 键 "age" 对应的值为 "two" ，所以将 "(age)" 替换为 "two" 。
 *
 * 示例 2：
 *
 * 输入：s = "hi(name)", knowledge = [["a","b"]]
 * 输出："hi?"
 * 解释：由于不知道键 "name" 对应的值，所以用 "?" 替换 "(name)" 。
 * 示例 3：
 *
 * 输入：s = "(a)(a)(a)aaa", knowledge = [["a","yes"]]
 * 输出："yesyesyesaaa"
 * 解释：相同的键在 s 中可能会出现多次。
 * 键 "a" 对应的值为 "yes" ，所以将所有的 "(a)" 替换为 "yes" 。
 * 注意，不在括号里的 "a" 不需要被替换。
 */
