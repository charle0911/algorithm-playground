package com.main.leetcode.tree;

/**
 * 235. Lowest Common Ancestor of a Binary Search Tree
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/15
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(6);
        input1.left = new TreeNode(2);
        input1.right = new TreeNode(8);
        input1.left.right = new TreeNode(4);
        input1.left.right.left = new TreeNode(3);
        input1.left.right.right = new TreeNode(5);
        input1.left.left = new TreeNode(0);
        input1.right.left = new TreeNode(7);
        input1.right.right = new TreeNode(9);

        LowestCommonAncestorOfABinarySearchTree solution = new LowestCommonAncestorOfABinarySearchTree();

        System.out.println(solution.lowestCommonAncestor(input1, new TreeNode(2), new TreeNode(8)).val);
    }
}
