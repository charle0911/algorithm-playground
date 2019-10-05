package com.main.leetcode;

import java.security.cert.X509Certificate;
import java.util.stream.Stream;

/**
 * Leetcode ：167. Two Sum II - Input array is sorted (Easy)
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/4
 */
public class TwoSumTwo {
    public int[] twoSum(int[] numbers, int target) {
        int head = 0;
        int tail = numbers.length - 1;
        while(tail != head) {
            if (numbers[head] + numbers[tail] > target) {
                tail--;
            } else if (numbers[head] + numbers[tail] < target) {
                head++;
            } else {
                System.out.println(head);
                System.out.println(tail);
                return new int[]{head + 1, tail + 1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] inputArray = {2,7,11,15};
        TwoSumTwo solution = new TwoSumTwo();
        Stream.of(solution.twoSum(inputArray, 9)).forEach(x -> System.out.println(x));
    }
}
