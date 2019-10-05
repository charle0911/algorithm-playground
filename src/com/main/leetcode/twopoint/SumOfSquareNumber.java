package com.main.leetcode.twopoint;

/**
 * 633. Sum of Square Numbers (Easy)
 *
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/4
 */
public class SumOfSquareNumber {

    public boolean judgeSquareSum(int c) {
        int sqrtC = (int) Math.sqrt(c);
        int initialNumber = 0;
        while (sqrtC != initialNumber) {
            int sum = sqrtC * sqrtC + initialNumber * initialNumber;
            if (sum > c) {
                sqrtC--;
            } else if (sum < c) {
                initialNumber++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int input = 5;
        SumOfSquareNumber solution = new SumOfSquareNumber();
        System.out.println(solution.judgeSquareSum(input));
    }
}
