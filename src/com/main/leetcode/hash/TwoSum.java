package com.main.leetcode.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 *
 * By hash map
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/27
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> recordMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int subNumber = target - nums[i];
            if (recordMap.get(subNumber) != null) {
                result[0] = i;
                result[1] = recordMap.get(subNumber);
                break;
            }
            recordMap.put(nums[i], i);
        }
        return result;
    }
}
