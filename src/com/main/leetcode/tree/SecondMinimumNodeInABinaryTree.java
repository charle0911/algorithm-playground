package com.main.leetcode.tree;

public class SecondMinimumNodeInABinaryTree {

    private int minVal = -1;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        if (root.left == null && root.right == null) {
            return -1;
        }
        int leftVal = root.left.val;
        int rightVal = root.right.val;

        if (leftVal == root.val) {
            leftVal = findSecondMinimumValue(root.left);
        }

        if (rightVal == root.val) {
            rightVal = findSecondMinimumValue(root.right);
        }

        if (leftVal != -1 && rightVal != -1) {
            return Math.min(leftVal, rightVal);
        } else if (leftVal != -1) {
            return leftVal;
        }
        return rightVal;
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(2);
        input1.left = new TreeNode(2);
        input1.right = new TreeNode(5);
        input1.right.left = new TreeNode(5);
        input1.right.right = new TreeNode(6);

        SecondMinimumNodeInABinaryTree solution = new SecondMinimumNodeInABinaryTree();

        assert solution.findSecondMinimumValue(input1) != 5;
    }
}
