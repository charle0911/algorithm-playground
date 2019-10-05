package com.main.leetcode.tree;

/**
 * 226. Invert Binary Tree (Easy)
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/5
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode l = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(l);
        return root;
    }



    public static void main(String[] args) {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(5);
        input.left.right = new TreeNode(4);
        input.left.left = new TreeNode(3);

        InvertBinaryTree solution = new InvertBinaryTree();
        input.preorder();
        solution.invertTree(input);
        System.out.println();
        input.preorder();
    }
}
