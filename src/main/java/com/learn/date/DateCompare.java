package com.learn.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompare {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date d1 = sdf.parse("2020-01-03");
        Date d2 = new Date();

        System.out.println("====================================");
        System.out.println(d1.compareTo(d2));
        System.out.println("====================================");
    }
}
