package com.main.leetcode.string;

public class LongestPalindrome {

    public int longestPalindrome(String input) {
        int[] cnts = new int[256];

        for (char c : input.toCharArray()) {
            cnts[c]++;
        }
        int result = 0;

        for (int cnt : cnts) {
            result = result + (cnt/2) * 2;
        }

        if (result < input.length()) {
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "abccccdd";
        System.out.println(new LongestPalindrome().longestPalindrome(input));
    }
}
