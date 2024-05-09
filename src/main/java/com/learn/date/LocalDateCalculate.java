package com.learn.date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateCalculate {

    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

        Date start = sdf1.parse("2019/09/29");
        Date end = sdf2.parse("2019-10-01");

        calDiffDay(start,end);
    }

    public static void calDiffDay(Date start, Date end) {
        ZoneId zoneId = ZoneId.systemDefault();

        Instant startInstant = start.toInstant();
        LocalDateTime startDateTime = LocalDateTime.ofInstant(startInstant, zoneId);
        LocalDate startDate = startDateTime.toLocalDate();

        Instant endInstant = end.toInstant();
        LocalDateTime endDateTime = LocalDateTime.ofInstant(endInstant, zoneId);
        LocalDate endDate = endDateTime.toLocalDate();

        int diff = (int) (endDate.toEpochDay() - startDate.toEpochDay());

        System.out.println("=====================================");
        System.out.println(diff);
        System.out.println("=====================================");

    }

}
