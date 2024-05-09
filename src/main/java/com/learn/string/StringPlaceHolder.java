package com.learn.string;

import java.text.MessageFormat;

public class StringPlaceHolder {
    public static void main(String[] args) {
        String str = "123{0}5{1}";


        System.out.println(MessageFormat.format(str,4,6));
    }
}
