package com.learn.lambda.stu;

import com.learn.api.Converter;

public class LamConvert {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (param) -> 1;

        System.out.println(converter.convert("234"));
    }
}
