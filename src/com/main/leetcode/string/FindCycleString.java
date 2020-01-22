package com.main.leetcode.string;

public class FindCycleString {

    public boolean findCycle(String input, String searchTarget) {
        String step = input + input;
        return step.contains(searchTarget);
    }

    public static void main(String[] args) {
        String input = "AABCD";
        System.out.println(new FindCycleString().findCycle(input, "CDAA"));
    }
}
