package com.learn.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorNew {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        TradeInfo tradeInfo = new TradeInfo();

        System.out.println(tradeInfo);

        Class clazz = Class.forName("com.learn.constructor.TradeInfo");
        TradeInfo tradeInfo1 = (TradeInfo) clazz.newInstance();

        System.out.println(tradeInfo1);

        Constructor constructor = clazz.getConstructor();
        TradeInfo tradeInfo2 = (TradeInfo) constructor.newInstance();

        System.out.println(tradeInfo2);
    }
}
