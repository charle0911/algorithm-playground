package com.main.leetcode.sort;

/**
 * LeetCode from https://leetcode.com/problems/kth-largest-element-in-an-array/description/
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2019/9/13
 */
public class KthElement {

    public static int findKthElement(int[] data, int k) {
        k = data.length - k;
        int left = 0;
        int right = data.length-1;
        while (left < right) {
            int pivot = tailPartition(data, left, right);
            if (pivot == k) {
                break;
            } else if (pivot < k) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return data[k];
    }

    private static int tailPartition(int[] data, int left, int right) {
        int pivot = data[right];
        int i = left-1;
        int j = left;
        while (j < right) {
            System.out.println("i :" + i + " j : " + j);
            if (data[j] < pivot) {
                i++;
                swap(data, j, i);
            }
            j++;
        }
        i++;
        swap(data, i, right);
        return i;
    }

    private static void swap(int[] data, int i, int j) {
        int step = data[i];
        data[i] = data[j];
        data[j] = step;
    }
}
