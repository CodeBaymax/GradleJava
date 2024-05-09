package com.learn.dPattern.strategyModel.concreteStrategy;

import com.learn.dPattern.strategyModel.strategy.Member;

import java.math.BigDecimal;

public class PrimaryMember implements Member {

    @Override
    public BigDecimal memberPrice(BigDecimal price) {

        System.out.println("primary member");

        return price;
    }
}
