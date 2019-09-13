package com.main;

import com.main.leetcode.sort.KthElement;
import com.main.sort.QuickSort;

public class Main {

    public static void main(String[] args) {
        int[] inputData = {5, 9, 9, 1, 6, 7, 3, 8, 2, 5};
        QuickSort.sort(inputData);
        System.out.println(KthElement.findKthElement(inputData, 3));
    }
}
