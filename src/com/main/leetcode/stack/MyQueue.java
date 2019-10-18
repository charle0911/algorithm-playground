package com.main.leetcode.stack;

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

import java.util.Stack;
import java.util.stream.Stream;

/**
 * 232. Implement Queue using Stacks
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/19
 */
public class MyQueue {
    private Stack<Integer> in;
    private Stack<Integer> out;

    /** Initialize your data structure here. */
    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        inToOut();
        return out.pop();
    }

    /** Get the front element. */
    public int peek() {
        inToOut();
        return out.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    private void inToOut() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.peek());

        while (!queue.empty()) {
            System.out.println(queue.pop());
        }
    }
}

