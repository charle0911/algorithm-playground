package com.main.leetcode.array;

/**
 * 283. Move Zeroes
 *
 * https://leetcode.com/problems/move-zeroes/description/
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2020/2/4
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while(index < nums.length) {
            nums[index++] = 0;
        }
    }
}
