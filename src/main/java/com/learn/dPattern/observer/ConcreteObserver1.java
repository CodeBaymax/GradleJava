package com.learn.dPattern.observer;

/**
 * 具体观察者
 */
public class ConcreteObserver1 implements Observer {

    @Override
    public void response() {
        System.out.println("ConcreteObserver1 response...");
    }
}
