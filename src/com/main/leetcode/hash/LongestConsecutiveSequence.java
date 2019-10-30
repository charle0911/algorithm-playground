package com.main.leetcode.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 128. Longest Consecutive Sequence (Hard)
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/29
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i : nums) {
            map.put(i, 1);
        }

        for (int i : nums) {
            forwardNumber(i, map);
        }

        for (Integer i : map.values()) {
            result = Math.max(result, i);
        }
        return result;
    }

    private int forwardNumber(int i, Map<Integer, Integer> map) {
        if (!map.containsKey(i)) {
            return 0;
        }
        int cnt = map.get(i);
        if (cnt > 1) {
            return cnt;
        }

        cnt = forwardNumber(i+1, map) + 1;

        map.put(i, cnt);
        return cnt;
    }

    private int maxCount(int i, Set<Integer> set) {
        int stepNumber = 0;
        System.out.println(i);
        if (set.contains(i)) {
            stepNumber++;
            set.remove(i);
            stepNumber += maxCount(i + 1, set);
        }
        return stepNumber;
    }

    public static void main(String[] args) {
        int[] input = {100, 4, 200, 1, 3, 2};
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        System.out.println(solution.longestConsecutive(input));
    }
}
