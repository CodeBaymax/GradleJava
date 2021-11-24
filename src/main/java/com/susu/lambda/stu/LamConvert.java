package com.susu.lambda.stu;

import com.susu.api.Converter;

public class LamConvert {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (param) -> 1;

        System.out.println(converter.convert("234"));
    }
}
