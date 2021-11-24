package com.susu.lambda.stu;

import com.susu.api.Converter;

public class OrdinaryConvert {

    public static void main(String[] args) {
        Converter<String, Integer> converter = new Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.parseInt(from);
            }
        };

        System.out.println(converter.convert("121") + 1);
    }


}
