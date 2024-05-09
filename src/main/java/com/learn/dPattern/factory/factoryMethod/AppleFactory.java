package com.learn.dPattern.factory.factoryMethod;

import com.learn.dPattern.factory.product.IPhone;
import com.learn.dPattern.factory.product.Phone;

public class AppleFactory implements MethodFactory {

    @Override
    public Phone makePhone() {
        return new IPhone();
    }
}
