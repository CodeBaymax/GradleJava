package com.learn.datastructure.queue;

/**
 * 利用数组实现循环队列
 */
public class CircularQueue {

    public int front = 0;
    public int rear = 0;

    int[] elem;

    public CircularQueue(int size) {
        this.elem = new int[size];
    }

//    public boolean enQueue(int val) {
//
//    }
//
//    public boolean isEmpty() {
//
//    }
}
