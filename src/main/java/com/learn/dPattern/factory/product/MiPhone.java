package com.learn.dPattern.factory.product;

public class MiPhone implements Phone {

    public MiPhone() {
        this.make();
    }

    public void make() {
        System.out.println("make xiaomi Phone...");
    }
}
