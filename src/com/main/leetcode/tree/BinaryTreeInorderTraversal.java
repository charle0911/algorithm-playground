package com.main.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;

        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            result.add(node.val);
            cur = node.right;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode input = new TreeNode(1);
        input.right = new TreeNode(2);
        input.right.left = new TreeNode(3);
        BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();
        Stream.of(solution.inorderTraversal(input)).forEach(System.out::println);
    }
}
