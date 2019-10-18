package com.main.leetcode.tree;

/**
 * 538. Convert BST to Greater Tree
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/15
 */
public class ConvertBSTToGreaterTree {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        treeRecursion(root);
        return root;
    }

    private void treeRecursion(TreeNode node) {
        if (node == null) {
            return;
        }
        treeRecursion(node.right);
        sum += node.val;
        node.val = sum;
        treeRecursion(node.left);
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(5);
        input1.left = new TreeNode(2);
        input1.right = new TreeNode(13);
        ConvertBSTToGreaterTree solution = new ConvertBSTToGreaterTree();
        solution.convertBST(input1).inorder();
    }
}
