package com.learn.dPattern.factory.abstractFactory;

import com.learn.dPattern.factory.product.PC;
import com.learn.dPattern.factory.product.Phone;

/**
 * 抽象工厂模式
 */
public interface AbstractFactory {

    Phone makePhone();

    PC makePC();
}
