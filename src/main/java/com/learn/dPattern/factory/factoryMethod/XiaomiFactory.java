package com.learn.dPattern.factory.factoryMethod;

import com.learn.dPattern.factory.product.MiPhone;
import com.learn.dPattern.factory.product.Phone;

public class XiaomiFactory implements MethodFactory {

    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}
