package com.main.leetcode.linkedlist;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

public class MergeTwoSortedLists {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode aHead = new ListNode(0);

        aHead.next = new ListNode(1);
        aHead.next.next = new ListNode(2);
        aHead.next.next.next = new ListNode(3);
        aHead.next.next.next.next = new ListNode(4);

        ListNode bHead = new ListNode(1);
        bHead.next = new ListNode(2);
        bHead.next.next = new ListNode(3);
        bHead.next.next.next = new ListNode(5);

        solution.mergeTwoLists(aHead, bHead);
    }
}
