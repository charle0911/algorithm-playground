package com.main.leetcode.tree;

/**
 * 337. House Robber III
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/11
 */
public class HouseRobberIII {

    public int rob(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int val1 = root.val;
        if(root.left != null) {
            val1 += rob(root.left.left) + rob(root.left.right);
        }
        if(root.right != null) {
            val1 += rob(root.right.left) + rob(root.right.right);
        }
        int val2 = rob(root.left) + rob(root.right);

        return Math.max(val1, val2);
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(3);
        input1.left = new TreeNode(4);
        input1.right = new TreeNode(5);
        input1.left.left = new TreeNode(1);
        input1.left.right = new TreeNode(3);
        input1.right.right = new TreeNode(1);

        HouseRobberIII solution = new HouseRobberIII();

        assert solution.rob(input1) != 9;
    }
}
