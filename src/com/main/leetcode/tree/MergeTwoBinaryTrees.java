package com.main.leetcode.tree;

/**
 * 617. Merge Two Binary Trees (Easy)
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/5
 */
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        else if (t1 == null) {
            return t2;
        }
        else if (t2 == null) {
            return t1;
        }
        TreeNode result = new TreeNode(t1.val + t2.val);
        result.left = mergeTrees(t1.left, t2.left);
        result.right = mergeTrees(t1.right, t2.right);
        return result;
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(1);
        input1.left = new TreeNode(3);
        input1.right = new TreeNode(2);
        input1.left.left = new TreeNode(5);
        TreeNode input2 = new TreeNode(2);
        input2.left = new TreeNode(1);
        input2.left.right = new TreeNode(4);

        input2.right = new TreeNode(3);
        input2.right.right = new TreeNode(7);

        System.out.println();
        input1.preorder();
        System.out.println();
        input2.preorder();
        System.out.println();

        MergeTwoBinaryTrees solution = new MergeTwoBinaryTrees();
        TreeNode result = solution.mergeTrees(input1, input2);
        result.preorder();
    }
}
