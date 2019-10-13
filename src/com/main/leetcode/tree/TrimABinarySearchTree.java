package com.main.leetcode.tree;

import java.util.stream.Stream;

/**
 * 669. Trim a Binary Search Tree
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/14
 */
public class TrimABinarySearchTree {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val < L) {
            return trimBST(root.right, L, R);
        }
        if (root.val > R) {
            return trimBST(root.left, L, R);
        }
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }

    public static void main(String[] args) {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(0);
        input.right= new TreeNode(2);
        int l = 1;
        int r = 2;
        TrimABinarySearchTree solution = new TrimABinarySearchTree();
        solution.trimBST(input, l, r).inorder();
    }
}
