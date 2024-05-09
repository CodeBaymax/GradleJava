package com.learn.dPattern.strategyModel.concreteStrategy;

import com.learn.dPattern.strategyModel.strategy.Member;

import java.math.BigDecimal;

public class IntermediateMember implements Member {

    @Override
    public BigDecimal memberPrice(BigDecimal price) {

        System.out.println("intermediate member");

        return price.multiply(new BigDecimal(0.9));
    }
}
