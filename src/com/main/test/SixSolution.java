package com.main.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class SixSolution {

    public List<Integer> reverseRecursionLinkList(ListNode node) {
        List<Integer> returnList = new ArrayList<>();
        if (node != null) {
            returnList.addAll(reverseRecursionLinkList(node.next));
            returnList.add(node.val);
        }
        return returnList;
    }

    public ListNode reverseLinkList(ListNode node) {
        ListNode head = new ListNode();
        while (node != null) {
            ListNode memo = node.next;
            node.next = head.next;
            head.next = node;
            node = memo;
        }
        return head;
    }

    public List<Integer> reversStackLinkList(ListNode node) {
        Stack<ListNode> stepStcak = new Stack<>();
        while (node != null) {
            stepStcak.push(node);
            node = node.next;
        }
        ArrayList<Integer> returnList = new ArrayList<>();
        while (!stepStcak.isEmpty()) {
            node = stepStcak.pop();
            returnList.add(node.val);
        }
        return returnList;
    }

    public static void main(String[] args) {
        SixSolution solution = new SixSolution();
        ListNode node = new ListNode();
        node.val = 1;
        ListNode node2 = new ListNode();
        node2.val = 2;
        ListNode node3 = new ListNode();
        node3.val = 3;
        node.next = node2;
        node2.next = node3;
        List<Integer> printData = solution.reverseRecursionLinkList(node);
        Stream.of(printData).forEach(System.out::println);
        printData = solution.reversStackLinkList(node);
        Stream.of(printData).forEach(System.out::println);
        ListNode printNode = solution.reverseLinkList(node);
        while (printNode != null) {
            System.out.println(printNode.val);
            printNode = printNode.next;
        }

    }

    static class ListNode {
        ListNode next;
        int val;
    }
}
