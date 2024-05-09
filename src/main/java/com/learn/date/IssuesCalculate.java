package com.learn.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class IssuesCalculate {
    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        String start = "2018-10-05";
        String end = "2018-12-17";
        String fixedDate = "16";

        System.out.println(loopIssues(start, end, fixedDate));
    }

    public static int loopIssues(String start, String end, String fixedDate) {
        Calendar startCal = Calendar.getInstance();
        Calendar endCal = Calendar.getInstance();

        try {
            startCal.setTime(FORMAT.parse(start));
            endCal.setTime(FORMAT.parse(end));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int issues = 0;
        Calendar flagCal = Calendar.getInstance();
        flagCal.setTime(startCal.getTime());
        flagCal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(fixedDate));

        if (startCal.before(flagCal)) {
            System.out.println("##########################" + FORMAT.format(flagCal.getTime()));
            issues++;
            flagCal.add(Calendar.MONTH, 1);
            System.out.println("++++++++++++++++++++++++++" + FORMAT.format(flagCal.getTime()));
        }

        while (flagCal.compareTo(endCal) <= 0) {
            System.out.println("=========================" + FORMAT.format(flagCal.getTime()));
            if (flagCal.compareTo(endCal) == 0) {
                flagCal.add(Calendar.MONTH, 1);
            } else {
                issues++;
                flagCal.add(Calendar.MONTH, 1);
            }

        }

        issues++;

        return issues;
    }

}
