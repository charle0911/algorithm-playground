package com.main.leetcode.string;

public class ShiftTheCharacter {

    public String reverseString(String input, int k) {
        String firstPart = input.substring(0, input.length() - k);
        String secondPart = input.substring(input.length() - k);
        return secondPart + firstPart;
    }

    public static void main(String[] args) {
        String input = "abcd123";
        ShiftTheCharacter solution = new ShiftTheCharacter();
        solution.reverseString(input, 3);
    }
}
