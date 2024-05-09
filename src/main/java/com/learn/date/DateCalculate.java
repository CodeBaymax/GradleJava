package com.learn.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalculate {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");

    // 计算两个日期相差月份
    public static int calculateMonth(String start, String end) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar startDate = Calendar.getInstance();
        Calendar endDate = Calendar.getInstance();

        try {
            startDate.setTime(sdf.parse(start));
            endDate.setTime(sdf.parse(end));
        } catch (Exception e) {
//            e.printStackTrace();
            throw new RuntimeException("转化失败");
        }

        int monthResult = endDate.get(Calendar.MONTH) - startDate.get(Calendar.MONTH);
        int yearResult = (endDate.get(Calendar.YEAR) - startDate.get(Calendar.YEAR)) * 12;
        System.out.println(startDate.get(Calendar.DATE));
        return monthResult + yearResult;
    }

    // 计算两个日期相差天数
    public static int calculateDay(Date start, Date end) {
        if (end.getTime() - start.getTime() <= 0) {
            return 0;
        }
        Double intervals = ((end.getTime() - start.getTime()) / (1000 * 3600 * 24.0));

        return (int) Math.ceil(intervals);

    }

    // 计算两个日期相差季度数
    public static  int calculateQuartar(String start, String end) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar startDate = Calendar.getInstance();
        Calendar endDate = Calendar.getInstance();

        try {
            startDate.setTime(sdf.parse(start));
            endDate.setTime(sdf.parse(end));
        } catch (Exception e) {
//            e.printStackTrace();
            throw new RuntimeException("转化失败");
        }

        int monthDiff = (endDate.get(Calendar.YEAR) - startDate.get(Calendar.YEAR)) * 12 + (endDate.get(Calendar.MONTH) - startDate.get(Calendar.MONTH));

        int result = monthDiff / 3 + 1;

        System.out.println(getQuartar(start));
        return result;
    }

    // 获取当前月份所在季度
    public static int getQuartar(String date) {
        int quartar = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar startDate = Calendar.getInstance();
        try {
            startDate.setTime(sdf.parse(date));
        } catch (Exception e) {
//            e.printStackTrace();
            throw new RuntimeException("转化失败");
        }

        int month = startDate.get(Calendar.MONTH);
        switch (month) {
            case Calendar.JANUARY :
            case Calendar.FEBRUARY:
            case Calendar.MARCH:
                quartar = 1;
                break;
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                quartar = 2;
                break;
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                quartar = 3;
                break;
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
            case Calendar.DECEMBER:
                quartar = 4;
                break;
            default:
                break;
        }
        return quartar;
    }

    public static void nextDay(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar startDate = Calendar.getInstance();
        try {
            startDate.setTime(sdf.parse(date));
        } catch (Exception e) {
            throw new RuntimeException("转化失败");
        }

        startDate.add(Calendar.DAY_OF_MONTH, 1);

        Calendar c = startDate;
        c.set(Calendar.MONTH, 3);

        System.out.println(sdf.format(startDate.getTime()));
        System.out.println(sdf.format(c.getTime()));
    }

    public static  void nextMonth(String date) {
        Calendar cal = Calendar.getInstance();

        try {
            cal.setTime(SDF.parse(date));
        } catch (Exception e) {
            throw new RuntimeException("转化失败");
        }

        cal.add(Calendar.MONTH, 1);

        System.out.println(SDF.format(cal.getTime()));
    }


    public static void main(String[] args) {
        String start = "2018-04-05";
        String end = "2018-04-08";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date startDate = sdf.parse(start);
            Date endDate = sdf.parse(end);

            System.out.println(calculateDay(startDate, endDate));
//            System.out.println(startDate.compareTo(endDate));

        } catch (Exception e) {

        }

//        System.out.println(calculateQuartar(start, end));

//        nextMonth(start);
//        nextDay(start);
    }

}
