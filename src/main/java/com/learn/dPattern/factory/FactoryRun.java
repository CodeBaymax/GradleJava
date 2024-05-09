package com.learn.dPattern.factory;

import com.learn.dPattern.factory.abstractFactory.AbstractFactory;
import com.learn.dPattern.factory.abstractFactory.XiaomiFactory;
import com.learn.dPattern.factory.factoryMethod.MethodFactory;
import com.learn.dPattern.factory.factoryMethod.AppleFactory;
import com.learn.dPattern.factory.simpleF.SimplePhoneFactory;

public class FactoryRun {
    public static void main(String[] args) {
        // 简单工厂模式
        SimplePhoneFactory simplePhoneFactory = new SimplePhoneFactory();
        simplePhoneFactory.makePhone("MiPhone");

        // 工厂方法模式
        MethodFactory mFactory = new AppleFactory();
        mFactory.makePhone();

        // 抽象工厂模式
        AbstractFactory xiaomiFactory = new XiaomiFactory();
        AbstractFactory appleFactory = new com.learn.dPattern.factory.abstractFactory.AppleFactory();
        xiaomiFactory.makePC();
        xiaomiFactory.makePhone();
        appleFactory.makePhone();
        appleFactory.makePC();
    }
}
