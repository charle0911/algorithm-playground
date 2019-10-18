package com.main.leetcode.tree;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/17
 */
public class ConvertSortedArraytoBinarySearchTree {

    private TreeNode getBST(int[] nums, int sIndex, int eIndex) {
        if (sIndex > eIndex) {
            return null;
        }

        int mIndex = (sIndex + eIndex) / 2;
        TreeNode root = new TreeNode(nums[mIndex]);
        root.left = getBST(nums, sIndex, mIndex -1);
        root.right = getBST(nums, mIndex + 1, eIndex);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return getBST(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] input = {-10,-3,0,5,9};
        ConvertSortedArraytoBinarySearchTree soultion = new ConvertSortedArraytoBinarySearchTree();
        soultion.sortedArrayToBST(input).preorder();
    }
}
