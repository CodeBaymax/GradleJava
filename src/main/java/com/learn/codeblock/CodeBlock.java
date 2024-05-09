package com.learn.codeblock;

public class CodeBlock {

    // 普通代码块
    public static void main(String[] args) {
        System.out.println("this is normal code block");

        Record record1 = new Record();
        Record record2 = new Record();

    }
}

class Record {
    // 构造代码块
    {
        System.out.println("this is building code block");
    }

    // 静态代码块
    static {
        System.out.println("this is static code block");
    }
}

