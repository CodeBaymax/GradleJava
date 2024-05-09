package com.learn.string;

import java.util.Arrays;

public class StringSplit {

    public static void main(String[] args) {
        String str = "1001|1002";
        String[] arr = str.split("\\|");
        Arrays.stream(arr).forEach(temp -> System.out.println(temp));
        System.out.println("===========================================");

        spitSpace();
    }

    public static void spitSpace() {
        String str = "a  s    d f";

        String[] arr = str.split(" ");
        Arrays.stream(arr).forEach(temp -> System.out.println(temp));

        System.out.println("+++++++++++++++++++++++");
        String[] arr1 = str.split("\\s+");
        Arrays.stream(arr1).forEach(temp -> System.out.println(temp));
    }

}
