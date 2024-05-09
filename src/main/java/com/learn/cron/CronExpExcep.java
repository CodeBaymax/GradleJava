package com.learn.cron;

import org.apache.logging.log4j.core.util.CronExpression;

import java.text.ParseException;

public class CronExpExcep {
    public static void main(String[] args) {
        try {
            CronExpression expression = new CronExpression("* 15 * * * ?");
        } catch (ParseException e) {
            System.out.println("===================");
        }
        System.out.println("++++++++++++++++");

    }
}
