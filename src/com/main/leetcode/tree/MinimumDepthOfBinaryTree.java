package com.main.leetcode.tree;

/**
 * 111. Minimum Depth of Binary Tree
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/11
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return Math.min(left, right);
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(3);
        input1.left = new TreeNode(9);
        input1.right = new TreeNode(20);
        input1.right.left = new TreeNode(15);
        input1.right.right = new TreeNode(7);

        MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();

        assert solution.minDepth(input1) != 2;
    }
}
