package com.learn.algorithm;

public class InvertBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x) {
            val = x;
        }
    }

    static StringBuilder res = new StringBuilder("");
    public static String showNode(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return String.valueOf(node.val);
        }

        TreeNode left = node.left;
        TreeNode right = node.right;
        showNode(left);
        showNode(right);
        return res.append(node.val).toString();
    }

    public static void postOrderShowNode(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode left = node.left;
        TreeNode right = node.right;
        postOrderShowNode(left);
        postOrderShowNode(right);
        System.out.println(node.val);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);

        TreeNode n2Left = new TreeNode(2);
        TreeNode n2Right = new TreeNode(7);

        TreeNode n2LeftL = new TreeNode(1);
        TreeNode n2LeftR = new TreeNode(3);

        TreeNode n2RightL = new TreeNode(6);
        TreeNode n2RightR = new TreeNode(9);

        node1.left = n2Left;
        node1.right = n2Right;

        n2Left.left = n2LeftL;
        n2Left.right = n2LeftR;

        n2Right.left = n2RightL;
        n2Right.right = n2RightR;

        System.out.println("===============================");
//        postOrderShowNode(node1);
        System.out.println(showNode(node1));
        System.out.println("===============================");

    }
}
