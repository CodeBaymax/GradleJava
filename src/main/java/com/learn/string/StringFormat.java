package com.learn.string;

public class StringFormat {

    public static void main(String[] args) {
        String str = "010";

        String strFor = String.format("%8s", str).replace(" ", "0");
        System.out.println("============================");
        System.out.println(strFor);
    }
}
