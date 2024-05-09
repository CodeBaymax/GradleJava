package com.learn.extendsAndImplements;

public class SubClass extends AbstractClass {

    @Override
    public String test() {
        super.test();
        System.out.println("sub class ...");

        return "sub";
    }
}
