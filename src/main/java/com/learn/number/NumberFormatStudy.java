package com.learn.number;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class NumberFormatStudy {

    public static void main(String[] args) throws Exception {
        NumberFormat nf = NumberFormat.getPercentInstance();
        String numStr = "4.5%";

        Number num = nf.parse(numStr);

        BigDecimal bd = new BigDecimal(num + "");

        System.out.println(bd);
    }
}
