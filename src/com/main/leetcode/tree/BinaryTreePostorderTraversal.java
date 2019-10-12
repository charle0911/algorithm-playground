package com.main.leetcode.tree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

/**
 * 145. Binary Tree Postorder Traversal
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/13
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null) {
                continue;
            }
            result.add(node.val);
            stack.push(node.left);
            stack.push(node.right);
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        TreeNode input = new TreeNode(1);
        input.right = new TreeNode(2);
        input.right.left = new TreeNode(3);
        BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();
        Stream.of(solution.postorderTraversal(input)).forEach(System.out::println);
    }
}
