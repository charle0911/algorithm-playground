package com.main.leetcode.string;

import java.util.Map;

public class FindSameCharacter {

    public boolean search(String input, String target) {
        int[] cnts = new int[26];

        for (char c : input.toCharArray()) {
            cnts[c - 'a']++;
        }

        for (char c : target.toCharArray()) {
            cnts[c - 'a']--;
        }

        for (int cnt : cnts) {
            if (cnt != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "anagram";
        String target = "nagaram";
        System.out.println(new FindSameCharacter().search(input,target));
    }

}
