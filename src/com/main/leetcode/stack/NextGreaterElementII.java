package com.main.leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * 503. Next Greater Element II
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/25
 */
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num ) {
                result[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NextGreaterElementII solution = new NextGreaterElementII();
        Arrays.stream(solution.nextGreaterElements(new int[]{7, 7, 8, 8, 9, -1, 3})).forEach(System.out::print);
    }
}
