package com.main.leetcode.linkedlist;

import java.util.Stack;

public class SwapNodesInPairs {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(-1);
        ListNode pre = node;
        while (pre.next != null && pre.next.next != null) {
            ListNode l1 = pre.next;
            ListNode l2 = pre.next.next;
            ListNode next = l2.next;
            l1.next = next;
            l2.next = l1;
            pre.next = l2;

            pre = next;
        }
        return node.next;
    }

    public static void main(String[] args) {
        SwapNodesInPairs solution = new SwapNodesInPairs();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        solution.swapPairs(head);
    }
}
