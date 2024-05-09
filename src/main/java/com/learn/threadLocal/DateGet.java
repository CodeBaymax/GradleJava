package com.learn.threadLocal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateGet {

    public static Date getDate(int i) {
        Date date = null;

        try {
            switch (i) {
                case 0:
                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20200101 00:00:00");
                    break;
                case 1:
                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20210101 01:01:01");
                    break;
                case 2:
                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20220202 02:02:02");
                    break;
                case 3:
                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20230303 03:03:03");
                    break;
                case 4:
                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20240404 04:04:04");
                    break;
                case 5:
                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20250505 05:05:05");
                    break;
                default:
                    date = new SimpleDateFormat("yyyyMMdd hh:mm:ss").parse("20260606 06:06:06");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            return date;
        }
    }
}
