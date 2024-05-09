package com.learn.topic;

public class PalindromicSubString {
    public static void main(String[] args) {
//        String s = "babad";
//        String s = "cbbd";
        String s = "ac";
        System.out.println("================");
        System.out.println(longestPalindrome1(s));
    }

    public static String longestPalindrome(String s) {

        char[] arr = s.toCharArray();

        String result = "";
        StringBuilder temp = new StringBuilder("");
        StringBuilder reverse = new StringBuilder("");

        boolean repeatFlag = false;
        for (int i = 0; i < arr.length; i++) {

            char start = arr[i];
            temp.append(start);
            reverse.append(start);

            for (int j = i+1; j < arr.length; j++) {
                temp.append(arr[j]);
                reverse.insert(0, arr[j]);

                if (start != arr[j]) {

                    if (repeatFlag) {
                        repeatFlag = false;
                        break;
                    }
                    continue;
                }

                if (arr[j] == arr[j+1]) {

                    if (temp.length() > result.length()) {
                        result = temp.toString();
                    }
                    continue;
                }

                if (temp.toString().equals(reverse.toString()) && temp.length() > result.length()) {
                    result = temp.toString();

                    temp = new StringBuilder("");
                    reverse = new StringBuilder("");
                    break;
                }
            }
        }

        return result;
    }

    public static String longestPalindrome1(String s) {

        char[] arr = s.toCharArray();

        String result = "";
        StringBuilder temp = new StringBuilder("");
        StringBuilder reverse = new StringBuilder("");

        for (int i = 0; i < arr.length; i++) {

            char start = arr[i];
            temp.append(start);
            reverse.append(start);

            if (temp.length() > result.length()) {
                result = temp.toString();
            }

            for (int j = i+1; j < arr.length; j++) {
                temp.append(arr[j]);
                reverse.insert(0, arr[j]);

                if (temp.toString().equals(reverse.toString()) && temp.length() > result.length()) {
                    result = temp.toString();
                }

                if (j == arr.length - 1) {
                    temp = new StringBuilder("");
                    reverse = new StringBuilder("");
                }
            }
        }

        return result;
    }
}
