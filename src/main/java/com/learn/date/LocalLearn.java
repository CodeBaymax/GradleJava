package com.learn.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalLearn {

    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        LocalDate date = LocalDate.now();

        System.out.println(time);
        System.out.println(date);
        System.out.println(time.toLocalDate());
    }
}
