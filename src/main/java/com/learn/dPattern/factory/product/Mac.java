package com.learn.dPattern.factory.product;

public class Mac implements PC {

    public Mac() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make MAC...");
    }
}
