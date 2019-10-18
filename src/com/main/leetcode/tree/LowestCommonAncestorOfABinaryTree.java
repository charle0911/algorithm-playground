package com.main.leetcode.tree;

/**
 * 236. Lowest Common Ancestor of a Binary Tree
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/17
 */
public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        return left == null ? right : right == null ? left : root;
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(3);
        input1.left = new TreeNode(5);
        input1.right = new TreeNode(1);
        input1.left.right = new TreeNode(2);
        input1.left.right.left = new TreeNode(7);
        input1.left.right.right = new TreeNode(4);
        input1.left.left = new TreeNode(6);
        input1.right.left = new TreeNode(0);
        input1.right.right = new TreeNode(8);

        LowestCommonAncestorOfABinaryTree solution = new LowestCommonAncestorOfABinaryTree();

        System.out.println(solution.lowestCommonAncestor(input1, input1.right.left, input1.left.right).val);
    }
}
