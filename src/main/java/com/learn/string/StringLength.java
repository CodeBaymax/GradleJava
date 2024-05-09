package com.learn.string;

public class StringLength {

    public static void main(String[] args) throws Exception {
        String str = "as的";

        int utf8Lenth = str.getBytes("utf-8").length;
        int gbkLength = str.getBytes("gbk").length;
        int utf16Length = str.getBytes("utf-16").length;

        System.out.println(str);

        System.out.println(str.length());
        System.out.println("============================");
        System.out.println(utf8Lenth);
        System.out.println("============================");
        System.out.println(gbkLength);
        System.out.println("============================");
        System.out.println(utf16Length);
    }
}
