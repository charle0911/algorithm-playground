package com.main.leetcode.array;

/**
 * 153. Find Minimum in Rotated Sorted Array
 * <p>
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2020/2/5
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int head = 0;
        int tail = nums.length - 1;
        while (head < tail) {
            int mid = (head + tail) / 2;
            if (nums[mid] > nums[tail]) {
                head = mid + 1;
            } else {
                tail = mid;
            }
        }
        return nums[tail];
    }

    public static void main(String[] args) {
        int[] test = new int[]{3,4,5,1,2};
        FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();
        System.out.println(solution.findMin(test));
    }
}
