package com.learn.dPattern.state;

import java.util.Random;

public class CanRaffeState implements State {

    private RaffleActivity activity;

    public CanRaffeState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }

    @Override
    public void deductPoints() {
        System.out.println("已扣除积分...");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖...");

        int num = new Random().nextInt(5);
        if (num == 0) {
            System.out.println("恭喜中奖");
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有中奖");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("抽奖中，不能发放奖品");
    }
}
