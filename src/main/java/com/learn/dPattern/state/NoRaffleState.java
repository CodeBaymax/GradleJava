package com.learn.dPattern.state;

public class NoRaffleState implements State {

    private RaffleActivity activity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }

    @Override
    public void deductPoints() {
        System.out.println("扣除50积分，可以进行抽奖了...");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣除积分后才可以抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
