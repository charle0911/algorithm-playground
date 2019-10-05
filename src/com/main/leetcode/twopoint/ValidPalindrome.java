package com.main.leetcode.twopoint;

/**
 * 680. Valid Palindrome II (Easy)
 *
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/4
 */
public class ValidPalindrome {

    public boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j ; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "abca";
        ValidPalindrome solution = new ValidPalindrome();
        System.out.println(solution.validPalindrome(input));
    }
}
