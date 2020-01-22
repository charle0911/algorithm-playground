package com.main.leetcode.linkedlist;

public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        head.next = deleteDuplicates(head.next);

        return head.val == head.next.val? head.next : head;
    }
}
