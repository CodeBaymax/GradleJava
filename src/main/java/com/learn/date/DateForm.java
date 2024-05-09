package com.learn.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateForm {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("=================");
//        System.out.println(sdf.format(new Date()));
        System.out.println(sdf1.format(new Date()));
        System.out.println("=================");
    }
}
