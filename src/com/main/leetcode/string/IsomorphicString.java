package com.main.leetcode.string;

/**
 * 205. Isomorphic Strings
 *
 * You may assume both s and t have the same length.
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/11/27
 */
public class IsomorphicString {
    public boolean isIsomorphic(String t, String s) {
        int[] preIndexOfS = new int[256];
        int[] preIndexOfT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (preIndexOfS[sc] != preIndexOfT[tc]) {
                return false;
            }
            preIndexOfS[sc] = i+1;
            preIndexOfT[tc] = i+1;
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "edd";
        String t = "add";
        int test = 2;
        System.out.println(new IsomorphicString().isIsomorphic(t,s));
    }
}
