package com.main.leetcode.array;

/**
 * 485. Max Consecutive Ones
 *
 * https://leetcode.com/problems/max-consecutive-ones/description/
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2020/2/4
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int result = 0;
        int stepNumber =0;

        for (int i : nums) {
            if (i == 0) {
                result = Math.max(result, stepNumber);
                stepNumber = 0;
            } else {
                stepNumber++;
            }
        }

        return Math.max(result, stepNumber);
    }
}
