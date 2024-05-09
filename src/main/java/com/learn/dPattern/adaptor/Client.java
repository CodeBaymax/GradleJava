package com.learn.dPattern.adaptor;

public class Client {

    public static void main(String[] args) {
        PowerTarget target = new PowerAdaptor();
        target.output5V();
    }
}
