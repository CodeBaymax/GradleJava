package com.learn.datastructure.linkedList;

/**
 * 单向列表
 */
public class SinglyLinkedList {

    private Node head;

    private int size;

    public SinglyLinkedList(int data) {
        head = new Node(data);
        size = 1;
    }

    /**
     * 链表头插入
     * @param data
     */
    public void addFirst(int data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        size++;
    }

    /**
     * 链表尾插入
     * @param data
     */
    public void addEnd(int data) {
        Node cur = head;

        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = new Node(data);
        size++;
    }

    /**
     * 返回第index个节点
     * @param index
     * @return
     */
    public Node indexOf(int index) {
        if (index <= 0) {
            return head;
        }

        Node node = head;

        int i = 1;
        while (i < index) {
            node = node.next;
            i++;
        }

        return node;
    }

    public void addIndexOf(int index, int data) {

    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList(2);
        linkedList.addEnd(3);
        linkedList.addFirst(1);
        linkedList.addEnd(4);
        linkedList.addEnd(5);

        System.out.println(linkedList.indexOf(1).data);
        System.out.println(linkedList.indexOf(3).data);
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
