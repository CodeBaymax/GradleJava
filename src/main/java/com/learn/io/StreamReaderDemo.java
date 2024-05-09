package com.learn.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class StreamReaderDemo {

    public static void main(String[] args) {
        systemIn();
    }

    public static void systemIn() {
        System.out.println("请输入第一个数字： ");
        InputStream is = System.in;
        try {
            // 读取一个字节，读取内容赋值给a
            int a = is.read();

            byte[] bytes = new byte[2];
            // 读取bytes长度的字节，并存到bytes数组中
            int num = is.read(bytes);
            System.out.println("++++++++++++++++++++");
            System.out.println((char) a);
            System.out.println(num);
            System.out.println(new String(bytes, StandardCharsets.UTF_8));
            System.out.println("++++++++++++++++++++");

            BufferedReader bu = new BufferedReader(new InputStreamReader(is));

            String str = bu.readLine();

            System.out.println("===================");
            System.out.println(str);
            System.out.println("===================");
        } catch (Exception e) {

        }

    }
}
