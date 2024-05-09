package com.learn.enums;

import java.util.Arrays;

public class EnumProp {

    public static void main(String[] args) {
        Arrays.stream(AdjustTypeEnum.values()).forEach(adjust -> System.out.println(adjust));

        System.out.println("======================================");
        System.out.println(AdjustTypeEnum.valueOf("IM"));
        System.out.println(AdjustTypeEnum.valueOf("IM").toString());
        System.out.println("======================================");
    }
}
