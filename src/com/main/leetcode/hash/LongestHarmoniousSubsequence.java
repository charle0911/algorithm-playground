package com.main.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 594. Longest Harmonious Subsequence
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/28
 */
public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.containsKey(i+1)) {
                result = Math.max(result, map.get(i) + map.get(i+1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input =  {1,3,2,2,5,2,3,7};

        LongestHarmoniousSubsequence solution = new LongestHarmoniousSubsequence();
        System.out.println(solution.findLHS(input));
    }
}
