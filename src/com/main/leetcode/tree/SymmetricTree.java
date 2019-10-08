package com.main.leetcode.tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;
        return isSymmetricOfRoot(root.left, root.right);
    }

    private boolean isSymmetricOfRoot(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null || r == null) return false;
        if (l.val != r.val) return false;
        return isSymmetricOfRoot(l.left, r.right) && isSymmetricOfRoot(l.right, r.left);
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(3);
        input1.left = new TreeNode(1);
        input1.right = new TreeNode(1);
        input1.left.left = new TreeNode(2);
        input1.left.right = new TreeNode(3);
        input1.right.right = new TreeNode(3);
        input1.right.left = new TreeNode(2);

        SymmetricTree solution = new SymmetricTree();
        solution.isSymmetric(input1);
    }
}
