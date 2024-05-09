package com.learn.topic;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(9);

        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        ListNode l24 = new ListNode(9);

        l21.next = l22;
        l22.next = l23;
        l23.next = l24;

//        ListNode temp = l11;
//        while (temp != null) {
//            System.out.println(temp.val);
//            temp = temp.next;
//        }

        ListNode ln = addTwoNumbers(l11, l21);
        ListNode temp = ln;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 249  5649
        ListNode first = null;
        ListNode pre = null;
        boolean flag = false;
        while (l1 != null || l2 != null) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            if (flag) {
                sum = sum + 1;
            }

            if (sum >= 10) {
                flag = true;
                sum = sum - 10;
            } else {
                flag = false;
            }

            if (pre == null) {
                pre = new ListNode(sum);
                first = pre;
            } else {
                ListNode ln = new ListNode(sum);
                pre.next = ln;
                pre = ln;
            }

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (flag == true) {
            pre.next = new ListNode(1);
        }

        return first;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/**
 * 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 示例 1：
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 *
 * 示例 2：
 *
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 *
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *   
 *
 * 提示：
 *
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 */
