package com.main.leetcode.tree;

/**
 * 543. Diameter of Binary Tree (Easy)
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/5
 */
public class DiameterOfBinaryTree {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        max = Math.max(l+r, max);

        return Math.max(l, r) + 1;
    }

    public static void main(String[] args) {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.left.left = new TreeNode(3);
        DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
        System.out.println(solution.diameterOfBinaryTree(input));
    }
}
