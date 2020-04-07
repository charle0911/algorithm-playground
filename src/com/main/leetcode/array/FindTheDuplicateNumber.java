package com.main.leetcode.array;

/**
 * 287. Find the Duplicate Number
 *
 * https://leetcode.com/problems/find-the-duplicate-number/
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2020/2/6
 */
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        int len = nums.length;
        while (fast < len && nums[fast] < len) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                slow = 0;
                while (slow != fast) {
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return slow;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindTheDuplicateNumber solution = new FindTheDuplicateNumber();
        int[] test = new int[]{1,3,4,2,2};
        System.out.println(solution.findDuplicate(test));
    }
}
