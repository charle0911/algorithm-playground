package com.main.leetcode.linkedlist;

public class RemoveNthNodeFromEndOfList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        while (n-- > 0) {
            first = first.next;
        }

        ListNode second = head;

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return head;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();

        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);
        input.next.next.next.next.next = new ListNode(6);

        solution.removeNthFromEnd(input, 3);
    }
}
