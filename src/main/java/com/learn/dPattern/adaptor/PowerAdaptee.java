package com.learn.dPattern.adaptor;

/**
 * 适配者角色
 */
public class PowerAdaptee {

    private int output =  220;
    public int output220V() {
        System.out.println("电源输出电压：" + output);
        return output;
    }
}
