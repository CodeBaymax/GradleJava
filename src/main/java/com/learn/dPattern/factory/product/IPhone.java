package com.learn.dPattern.factory.product;

public class IPhone implements Phone {
    public IPhone() {
        this.make();
    }

    public void make() {
        System.out.println("make IPhone...");
    }
}
