package com.learn.dPattern.strategyModel.context;

import com.learn.dPattern.strategyModel.strategy.Member;

import java.math.BigDecimal;

public class Price {

    private Member member;

    public Price(Member member) {
        this.member = member;
    }

    public BigDecimal quote(BigDecimal price) {
        return this.member.memberPrice(price);
    }
}
