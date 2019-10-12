package com.main.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 513. Find Bottom Left Tree Value
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/12
 */
public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null) {
                queue.add(root.right);
            }
            if (root.left != null) {
                queue.add(root.left);
            }
        }
        return root.val;
    }

    public static void main(String[] args) {
        TreeNode input = new TreeNode(2);
        input.left = new TreeNode(1);
        input.right = new TreeNode(3);
        FindBottomLeftTreeValue solution = new FindBottomLeftTreeValue();
        System.out.println(solution.findBottomLeftValue(input));
    }
}
