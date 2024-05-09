package com.learn.number;

        import java.math.BigDecimal;

public class BigDecimalStudy {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(10000);
        BigDecimal b2 = new BigDecimal(360);
        BigDecimal b3 = new BigDecimal(0.045);

        BigDecimal result = b1.divide(b2, 3 ,BigDecimal.ROUND_CEILING);
        System.out.println(result);

        System.out.println("====================================");

        BigDecimal big = new BigDecimal(100);
        big.add(new BigDecimal(1));

        System.out.println(big);

        System.out.println("====================================");

        big = big.add(new BigDecimal(1));
        System.out.println(big);
    }
}
