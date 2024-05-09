package com.learn.topic;

import java.util.Scanner;

public class BinaryCount {

    public static void main(String[] args) {
        System.out.println("请输入两个整数，并以空格分隔：");
        Scanner scanner = new Scanner(System.in);

        String strIn = scanner.nextLine();

        String[] strArr = strIn.split(" ");
        int num1 = Integer.parseInt(strArr[0]);
        int num2 = Integer.parseInt(strArr[1]);

        String bStr1 = Integer.toBinaryString(num1);
        String bStr2 = Integer.toString(num2, 2);

        System.out.println("bStr1: " + bStr1);
        System.out.println("bStr2: " + bStr2);
        // =============================================================================
        if (bStr1.length() < bStr2.length()) {
            String temp = bStr2;
            bStr2 = bStr1;
            bStr1 = temp;
        }

//        bStr1 = String.format("%8s", bStr1).replace(" ", "0");
        if (bStr1.length() != bStr2.length()) {
            String format = "%" + bStr1.length() + "s";
            bStr2 = String.format(format, bStr2).replace(" ", "0");
        }

        System.out.println("bStr1: " + bStr1);
        System.out.println("bStr2: " + bStr2);

        char[] ch1 = bStr1.toCharArray();
        char[] ch2 = bStr2.toCharArray();

        int result = 0;
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                result++;
            }
        }

        System.out.println("result: " + result);
    }
}
