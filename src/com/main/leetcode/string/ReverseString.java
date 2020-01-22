package com.main.leetcode.string;

public class ReverseString {

    public String reverseString(String input) {
        String[] stepArray = input.split(" ");
        String result = "";
        for (String s : stepArray) {
            s = new StringBuffer(s).reverse().toString();
            result = result + " " + s;
        }

        return new StringBuffer(result).reverse().toString();


    }

    public static void main(String[] args) {
        String input = "I am a student";

        System.out.println(new ReverseString().reverseString(input));
    }
}
