package com.learn.topic;

import java.util.HashMap;

public class LongestSubStr {
    public static void main(String[] args) {
//        String str = "abcabcbb";
//        String str = "pwwkew";
        String str = "dvdf";

        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }

            max = Math.max(max, i - start + 1);
            map.put(c, i);
        }

        return max;
    }
}
