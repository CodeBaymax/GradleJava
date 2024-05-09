package com.learn.dPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 */
public abstract class Subject {

    protected List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {

        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public abstract void notifyObserver();
}
