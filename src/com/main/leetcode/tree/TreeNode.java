package com.main.leetcode.tree;

public class TreeNode {
    TreeNode(int x) { val = x; }
    TreeNode left;
    TreeNode right;
    int val;

    public void preorder() {
        System.out.print(val + "->");
        if (left != null) {
            left.preorder();
        }
        if (right != null) {
            right.preorder();
        }
    }

    public void inorder() {
        if (left != null) {
            left.preorder();
        }
        System.out.print(val + "->");
        if (right != null) {
            right.preorder();
        }
    }

    public void postorder() {
        if (left != null) {
            left.preorder();
        }
        if (right != null) {
            right.preorder();
        }
        System.out.print(val + "->");
    }
}
