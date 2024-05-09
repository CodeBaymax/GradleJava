package com.learn.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TradeTypeEnum {
    BUYOUT ("BYO", "买断", "BUYOUT"),
    COMPENSATION ("CPS", "代偿", "COMPENSATION"),
    DEDUCT ("DED", "买断", "DEDUCT");

    private String code;
    private String desc;
    private String type;


    public static void main(String[] args) {
        for (TradeTypeEnum tradeType : TradeTypeEnum.values()) {
            System.out.println("toString: " + tradeType.toString());
            System.out.println("code: " + tradeType.getCode());
            System.out.println("desc: " + tradeType.getDesc());
            System.out.println("type: " + tradeType.getType());
            System.out.println("TradeTypeEnum: " + tradeType);
        }
    }
}
