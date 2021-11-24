package com.susu.strategyModel.context;

import com.susu.strategyModel.strategy.Member;

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
