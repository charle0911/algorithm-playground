package com.main.leetcode.tree;

public class SubtreeofAnotherTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        return isSubTreeWithRoot(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSubTreeWithRoot(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.val != t.val)
            return false;
        return isSubTreeWithRoot(s.left, t.left) && isSubTreeWithRoot(s.right, t.right);
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(3);
        input1.left = new TreeNode(4);
        input1.right = new TreeNode(5);
        input1.left.left = new TreeNode(1);
        input1.left.right = new TreeNode(2);

        TreeNode input2 = new TreeNode(4);
        input2.left = new TreeNode(1);
        input2.left.right = new TreeNode(2);

        SubtreeofAnotherTree solution = new SubtreeofAnotherTree();
        assert !solution.isSubtree(input1, input2);
    }
}
