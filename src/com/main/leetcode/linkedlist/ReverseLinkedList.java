package com.main.leetcode.linkedlist;

import java.util.List;

/**
 * 206. Reverse Linked List
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/10/31
 */
public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
