package com.learn.dPattern.observer;

/**
 * 具体主题
 */
public class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver() {
        System.out.println("状态发生变化...准备通知观察者");

        for (Observer observer : observerList) {
            observer.response();
        }
    }
}
