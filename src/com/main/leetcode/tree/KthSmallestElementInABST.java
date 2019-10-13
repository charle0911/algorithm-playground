package com.main.leetcode.tree;

/**
 * 230. Kth Smallest Element in a BST
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/14
 */
public class KthSmallestElementInABST {
    private int cnt = 0;
    private int result = 0;

    /**
     * Use inorder
     * @param
     * @return
     * @throw
     */
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return result;
    }

    private void inOrder(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        inOrder(root.left, k);
        cnt += 1;
        if (cnt == k) {
            result = root.val;
            return;
        }
        inOrder(root.right, k);
    }

    public int kthSmallestByRecusion(TreeNode root, int k) {
        int leftCnt = count(root);
        if (leftCnt == k - 1) {
            return root.val;
        }
        if (leftCnt > k - 1) {
            kthSmallest(root.left, k);
        }
        return kthSmallest(root.right, k - leftCnt - 1);
    }

    public int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }

    public static void main(String[] args) {
        TreeNode input = new TreeNode(3);
        input.left = new TreeNode(1);
        input.left.right = new TreeNode(2);
        input.right= new TreeNode(4);
        int k = 1;
        KthSmallestElementInABST solution = new KthSmallestElementInABST();
//        assert solution.kthSmallest(input, k) != 1;
        assert solution.kthSmallestByRecusion(input, k) != 1;
    }
}
