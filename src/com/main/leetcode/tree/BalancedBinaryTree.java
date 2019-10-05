package com.main.leetcode.tree;

/**
 * 110. Balanced Binary Tree (Easy)
 *
 * Given the following tree [3,9,20,null,null,15,7]:
 * Return true.
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/5
 */
public class BalancedBinaryTree {
    boolean result = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l-r) > 1) {
            result = false;
        }
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.left.left = new TreeNode(3);
        BalancedBinaryTree solution = new BalancedBinaryTree();
        System.out.println(solution.isBalanced(input));
    }
}
