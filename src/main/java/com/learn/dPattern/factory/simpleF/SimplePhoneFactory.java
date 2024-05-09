package com.learn.dPattern.factory.simpleF;

import com.learn.dPattern.factory.product.IPhone;
import com.learn.dPattern.factory.product.MiPhone;
import com.learn.dPattern.factory.product.Phone;

/**
 * 简单工厂模式
 */
public class SimplePhoneFactory {

    public Phone makePhone(String type) {
        if (type.equalsIgnoreCase("MiPhone")) {
            return new MiPhone();
        }

        if (type.equalsIgnoreCase("IPhone")) {
            return new IPhone();
        }

        return null;
    }
}
