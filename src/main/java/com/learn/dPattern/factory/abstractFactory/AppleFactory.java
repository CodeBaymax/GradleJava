package com.learn.dPattern.factory.abstractFactory;

import com.learn.dPattern.factory.product.IPhone;
import com.learn.dPattern.factory.product.Mac;
import com.learn.dPattern.factory.product.PC;
import com.learn.dPattern.factory.product.Phone;

public class AppleFactory implements AbstractFactory {

    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public PC makePC() {
        return new Mac();
    }
}
