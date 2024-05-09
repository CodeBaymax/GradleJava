package com.learn.string;

import java.nio.charset.Charset;

public class SystemString {
    public static void main(String[] args) {
        //查看当前系统的字符编码方式
        System.out.println(Charset.defaultCharset().name());
        //查看当前系统的编码方式
        System.out.println(System.getProperty("file.encoding"));
    }
}
