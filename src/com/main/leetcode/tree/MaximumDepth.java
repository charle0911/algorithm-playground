package com.main.leetcode.tree;

/**
 * 104. Maximum Depth of Binary Tree (Easy)
 *
 * Given binary tree [3,9,20,null,null,15,7],
 * return its depth = 3.
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/5
 */
public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.left.left = new TreeNode(3);
        MaximumDepth solution = new MaximumDepth();
        System.out.println(solution.maxDepth(input));
    }
}
