package com.main.leetcode.stack;

import java.util.Stack;

/**
 * 155. Min Stack
 *
 * @author : Charlie Lee
 * @codeby : DEA
 * @since : a
 */
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int min;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        stack.push(val);
        min = Math.min(min, val);
        minStack.push(min);
    }

    public int pop() {
        minStack.pop();
        min = minStack.isEmpty() ? Integer.MAX_VALUE : minStack.peek();
        return stack.pop();
    }

    public int getMin() {
        return minStack.peek();
    }

    public int top() {
        return stack.peek();
    }
}
