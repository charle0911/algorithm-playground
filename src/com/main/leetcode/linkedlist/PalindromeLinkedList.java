package com.main.leetcode.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * 234. Palindrome Linked List
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/11/7
 */
public class PalindromeLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        cut(head, slow);

        return isEqual(head, reverse(slow));
    }

    private void cut(ListNode head, ListNode cutNode) {
        while (head.next != cutNode) {
            head = head.next;
        }
        head.next = null;
    }

    private ListNode reverse(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = newHead;
            newHead = head;
            head = nextNode;
        }
        return newHead;
    }

    private boolean isEqual(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList solution = new PalindromeLinkedList();
        ListNode aHead = new ListNode(0);
        aHead.next = new ListNode(1);
//        aHead.next.next = new ListNode(2);
//        aHead.next.next.next = new ListNode(3);
//        aHead.next.next.next.next = new ListNode(4);
//
//        aHead.next.next.next.next.next = new ListNode(4);
//        aHead.next.next.next.next.next.next = new ListNode(3);
//        aHead.next.next.next.next.next.next.next = new ListNode(2);
//        aHead.next.next.next.next.next.next.next.next = new ListNode(1);
//        aHead.next.next.next.next.next.next.next.next.next = new ListNode(0);

        System.out.println(solution.isPalindrome(aHead));
    }
}
