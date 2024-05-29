package com.learn.dPattern.state;

public interface State {

    // 扣减积分
    void deductPoints();

    // 是否中奖
    boolean raffle();

    // 发放奖品
    void dispensePrize();
}
