package com.main.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class FindModeInBST {
    private int cur = 1;
    private int max = 1;
    private List<Integer> result = new ArrayList<>();
    private TreeNode preRoot;
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[] resultArray = new int[result.size()];
        int i = 0;
        for (int x : result) {
            resultArray[i++] = x;
        }
        return resultArray;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);

        if (preRoot != null) {
            if (preRoot.val == root.val) {
                cur++;
            } else {
                cur = 1;
            }
        }
        if (cur > max) {
            result.clear();
            result.add(root.val);
            max = cur;
        } else if (cur == max) {
            result.add(root.val);
        }
        preRoot = root;

        inOrder(root.right);
    }

    public static void main(String[] args) {
        FindModeInBST solution = new FindModeInBST();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
//        root.right.left = new TreeNode(2);
        Stream.of(solution.findMode(root)).forEach(System.out::println);
    }
}
