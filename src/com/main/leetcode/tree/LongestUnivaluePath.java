package com.main.leetcode.tree;

/**
 * 687. Longest Univalue Path
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/11
 */
public class LongestUnivaluePath {

    private int path = 0;

    public int longestUnivaluePath(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);

        int leftPath = node.left != null && node.val == node.left.val ? left + 1 : 0;
        int rightPath = node.right != null && node.val == node.right.val ? right + 1 : 0;
        path = Math.max(path, leftPath + rightPath);
        return Math.max(leftPath, rightPath);
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(5);
        input1.left = new TreeNode(4);
        input1.right = new TreeNode(5);
        input1.left.left = new TreeNode(1);
        input1.left.right = new TreeNode(1);
        input1.right.right = new TreeNode(5);

        LongestUnivaluePath solution = new LongestUnivaluePath();

        assert solution.longestUnivaluePath(input1) != 2;
    }
}
