package com.learn.dPattern.state;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RaffleActivity {

    // 当前状态
    private State state;
    // 奖品数量
    private int count;

    public RaffleActivity(int count) {
        this.state = noRaffleState;
        this.count = count;
    }

    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffeState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState();

    // 扣除积分
    public void deductPoints() {
        state.deductPoints();
    }

    public void raffle() {
        if (state.raffle()) {
            state.dispensePrize();
        }
    }

    public int getCount() {
        int num = this.count;
        count--;
        return num;
    }

}
