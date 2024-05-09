package com.learn.dPattern.factory.abstractFactory;

import com.learn.dPattern.factory.product.MiPC;
import com.learn.dPattern.factory.product.MiPhone;
import com.learn.dPattern.factory.product.PC;
import com.learn.dPattern.factory.product.Phone;

public class XiaomiFactory implements AbstractFactory {

    @Override
    public Phone makePhone() {
        return new MiPhone();
    }

    @Override
    public PC makePC() {
        return new MiPC();
    }
}
