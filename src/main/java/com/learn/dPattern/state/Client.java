package com.learn.dPattern.state;

public class Client {

    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);

        for (int i = 0; i < 30; i++) {
            System.out.println("================ 第 " + i + " 次抽奖 ================");
            activity.deductPoints();

            activity.raffle();
        }
    }
}
