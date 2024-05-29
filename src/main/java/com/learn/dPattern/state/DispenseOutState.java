package com.learn.dPattern.state;

public class DispenseOutState implements State {

    @Override
    public void deductPoints() {
        System.out.println("活动已结束");
    }

    @Override
    public boolean raffle() {
        System.out.println("活动已结束");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("活动已结束");
    }
}
