package com.main.leetcode.tree;

/**
 * Leetcdoe : 112. Path Sum (Easy)
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/6
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.right == null && root.left == null && root.val == sum) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(5);
        input1.left = new TreeNode(4);
        input1.right = new TreeNode(8);
        input1.left.left = new TreeNode(11);
        input1.right.right = new TreeNode(4);
        input1.right.right.right = new TreeNode(1);

        input1.right.left = new TreeNode(13);
        input1.left.left.left = new TreeNode(7);
        input1.left.left.right = new TreeNode(2);


        int sum = 22;
        PathSum solution = new PathSum();
        System.out.println(solution.hasPathSum(input1, sum));
    }
}
