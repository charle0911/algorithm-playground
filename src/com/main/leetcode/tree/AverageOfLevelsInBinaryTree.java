package com.main.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

/**
 * 637. Average of Levels in Binary Tree
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/12
 */
public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int cnt = queue.size();
            double sum = 0;
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(sum/cnt);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(3);
        input1.left = new TreeNode(9);
        input1.right = new TreeNode(20);
        input1.right.left = new TreeNode(15);
        input1.right.right = new TreeNode(7);

        AverageOfLevelsInBinaryTree solution = new AverageOfLevelsInBinaryTree();

        Stream.of(solution.averageOfLevels(input1)).forEach(System.out::println);
    }
}
