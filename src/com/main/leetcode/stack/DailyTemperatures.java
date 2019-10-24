package com.main.leetcode.stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

/**
 * 739. Daily Temperatures
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/25
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] dist = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int curIndex = 0; curIndex < n; curIndex++) {
            while (!stack.isEmpty() && T[curIndex] > T[stack.peek()]) {
                int preIndex = stack.pop();
                dist[preIndex] = curIndex - preIndex;
            }
            stack.add(curIndex);
        }
        return dist;
    }

    public static void main(String[] args) {
        int[] intputData = {73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperatures solution = new DailyTemperatures();
        Arrays.stream(solution.dailyTemperatures(intputData)).forEach(System.out::println);
    }
}
