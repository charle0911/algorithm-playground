package com.main.leetcode.twopoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 345. Reverse Vowels of a String (Easy)
 *
 * Given s = "leetcode", return "leotcede".
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/4
 */
public class ReverseVowels {

    Set<Character> checkVowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        char[] result = new char[s.length()];
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!checkVowel.contains(ci)) {
                result[i++] = ci;
            } else if (!checkVowel.contains(cj)) {
                result[j--] = cj;
            } else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String input = "leetcode";
        ReverseVowels solution = new ReverseVowels();
        System.out.println(solution.reverseVowels(input));
    }
}
