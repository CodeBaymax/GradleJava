package com.learn.lambda;

import java.util.Arrays;
import java.util.List;

public class StartLambda {

    static void colorLambda() {
        String[] colors = {"Red", "Green", "Blue"};
        List<String> colorList = Arrays.asList(colors);

        // 1.传统循环方式
        System.out.println("======== for ========");
        for (String color : colorList) {
            System.out.println(color);
        }

        // 2.Lambda
        System.out.println("======== Lambda ========");
        colorList.forEach((color) -> System.out.println(color));

        // 3.Lambda
        System.out.println("======== Lambda ========");
        colorList.forEach(System.out::println);
    }

    public static void main(String args[]) {
        colorLambda();
    }
}
