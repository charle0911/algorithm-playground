package com.main.leetcode.tree;

/**
 * 437. Path Sum III
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/6
 */
public class PathSumThree {
    public int pathSum(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        return pathSumStartWith(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathSumStartWith(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        if (root.val == sum) {
            result += 1;
        }
        result += pathSumStartWith(root.right, sum - root.val) + pathSumStartWith(root.left, sum - root.val);
        return result;
    }

    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(10);
        input1.left = new TreeNode(5);
        input1.right = new TreeNode(-3);
        input1.left.left = new TreeNode(3);
        input1.left.right= new TreeNode(2);
        input1.left.right.left= new TreeNode(1);

        input1.right.right = new TreeNode(11);

        input1.right.left = new TreeNode(13);
        input1.left.left.left = new TreeNode(3);
        input1.left.left.right = new TreeNode(-2);


        int sum = 8;
        PathSumThree solution = new PathSumThree();
        System.out.println(solution.pathSum(input1, sum));
    }
}