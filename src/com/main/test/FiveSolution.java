package com.main.test;

public class FiveSolution {

    public String replaceSpace(StringBuffer input) {
        int p1 = input.length() - 1;
        for (int i = 0; i <= p1; i++) {
            if (input.charAt(i) == ' ') {
                input.append("  ");
            }
        }
        int p2 = input.length() - 1;
        while (p1 >=0 && p2 > p1) {
            char c = input.charAt(p1--);
            if (c == ' ') {
                input.setCharAt(p2--, '0');
                input.setCharAt(p2--, '2');
                input.setCharAt(p2--, '%');
            } else {
                input.setCharAt(p2--, c);
            }
        }
        return input.toString();
    }

    public static void main(String[] args) {
        String input = "A B C D E  F";
        System.out.println(new FiveSolution().replaceSpace(new StringBuffer(input)));
        int test = 5;
        int test2;
    }
}
