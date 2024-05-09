package com.learn.enums;

public class EnumCompare {
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println(HandleStatusEnum.FAIL.compareTo(HandleStatusEnum.INIT));
        System.out.println("=========================");

        System.out.println(HandleStatusEnum.FAIL.toString());
    }
}
