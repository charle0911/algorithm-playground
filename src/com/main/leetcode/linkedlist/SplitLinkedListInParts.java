package com.main.leetcode.linkedlist;

import java.util.List;

/**
 * 725. Split Linked List in Parts
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/11/14
 */
public class SplitLinkedListInParts {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode[] splitListToParts(ListNode root, int k) {

        ListNode[] result = new ListNode[k];
        ListNode step = root;
        int length = 0;

        while (step != null) {
            length++;
            step = step.next;
        }
        step = root;
        int averageSize = length / k;
        int remainder = length / k;

        for (int i = 0; i < k; i++) {
            result[i] = step;
            int averageAddition = (remainder-- == 0 ? 0 : 1);
            int arraySize = averageSize + averageAddition;
            for (int j = 0; j < arraySize; j++) {
                step = step.next;
            }
            ListNode next = step.next;
            step.next = null;
            step = next;
        }
        return result;
    }
}
