package com.main.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains duplicate
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/28
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
