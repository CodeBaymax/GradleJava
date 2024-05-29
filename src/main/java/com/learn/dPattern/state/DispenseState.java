package com.learn.dPattern.state;

public class DispenseState implements State {

    private RaffleActivity activity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }

    @Override
    public void deductPoints() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖，发放奖品...");
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品已发放完");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
