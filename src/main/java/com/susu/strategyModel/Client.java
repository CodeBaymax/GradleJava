package com.susu.strategyModel;

import com.susu.strategyModel.concreteStrategy.IntermediateMember;
import com.susu.strategyModel.context.Price;
import com.susu.strategyModel.strategy.Member;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {
        Member member = new IntermediateMember();

        Price price = new Price(member);

        System.out.println(price.quote(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_UP));


//        System.out.println(new IntermediateMember().memberPrice());
    }

}
