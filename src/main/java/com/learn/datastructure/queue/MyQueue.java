package com.learn.datastructure.queue;

/**
 * 单链表的方式模拟队列
 */
public class MyQueue {
    // 队头
    public Node front;
    // 队尾
    public Node rear;

    /**
     * 添加元素
     * @param val
     */
    public void offer(int val) {
        Node node = new Node(val);

        if (isEmpty()) {
            this.front = node;
        } else {
            this.rear.next = node;
        }
        this.rear = node;
    }

    /**
     * 判断是否为空队列
     * @return
     */
    public boolean isEmpty() {
        return this.front == null;
    }

    /**
     * 出队列
     * @return
     */
    public int poll() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法出队列");
        }

        int temp = this.front.val;
        // 只有一个节点
        if (front == rear) {
            this.front = null;
            this.rear = null;
            return temp;
        }

        this.front = this.front.next;
        return temp;
    }

    /**
     * 获取队头元素
     * @return
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法出队列");
        }

        return this.front.val;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.offer(6);
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);

        System.out.println("front: " + queue.front.val);
        System.out.println("rear: " + queue.rear.val);

        System.out.println("poll: " + queue.poll());
        System.out.println("poll front: " + queue.front.val);

        System.out.println("peek: " + queue.peek());
        System.out.println("poll front: " + queue.front.val);
    }
}

class Node {

    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

