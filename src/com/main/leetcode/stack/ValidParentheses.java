package com.main.leetcode.stack;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/23
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char checkC = stack.pop();
                if (c == '}' && checkC != '{') {
                    return false;
                }
                else if (c == ']' && checkC != '[') {
                    return false;
                }
                else if (c == ')' &&  checkC != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        System.out.println(solution.isValid("{{{}}}"));
    }
}
