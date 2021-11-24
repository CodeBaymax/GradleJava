package com.susu.strategyModel.concreteStrategy;

import com.susu.strategyModel.strategy.Member;

import java.math.BigDecimal;

public class AdvancedMember implements Member {

    @Override
    public BigDecimal memberPrice(BigDecimal price) {

        System.out.println("advanced member");

        return price.multiply(new BigDecimal(0.8));
    }
}
