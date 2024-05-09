package com.learn.extendsAndImplements;

import com.learn.entity.RepayRequest;

public class Client {

    public static void main(String[] args) {
        AbstractClass ac = new SubClass();
        System.out.println(ac.test());

        RepayRequest request = new RepayRequest();
        System.out.println(request);
    }
}
