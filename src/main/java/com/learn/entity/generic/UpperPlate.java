package com.learn.entity.generic;

public class UpperPlate<T extends Fruit> {
    private T item;

    public UpperPlate(T t) {
        this.item = t;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
