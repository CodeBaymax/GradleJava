package com.learn.threadLocal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalLearn {

    public static void main(String[] args) {
        SimpleDateFormat sdf = SimpleDfThreadLocal.tl.get();

        System.out.println(sdf.format(new Date()));
    }
}
