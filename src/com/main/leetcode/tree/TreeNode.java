package com.main.leetcode.tree;

public class TreeNode {
    TreeNode(int x) { val = x; }
    TreeNode left;
    TreeNode right;
    int val;

    public void preorder() {
        System.out.print(val + "->");
        if (left != null) {
            left.preorder();
        }
        if (right != null) {
            right.preorder();
        }
    }

    public void inorder() {
        if (left != null) {
            left.preorder();
        }
        System.out.print(val + "->");
        if (right != null) {
            right.preorder();
        }
    }

    public void postorder() {
        if (left != null) {
            left.preorder();
        }
        if (right != null) {
            right.preorder();
        }
        System.out.print(val + "->");
    }

    public TreeNode insertLevelOrder(int[] arr, TreeNode root,
                                 int i)
    {
        // Base case for recursion 
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            // insert left child 
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            // insert right child 
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }
}
