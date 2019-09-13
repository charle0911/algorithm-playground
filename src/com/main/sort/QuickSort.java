package com.main.sort;

import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void sort(int[] data) {
        quickSort(data,0,data.length-1);
    }

    private static void quickSort(int[] data, int left, int right) {
        System.out.println("Input left : " + left + " right : " + right);
        if (left < right) {
            int pivot = tailPartition(data, left, right);
            System.out.println("pivot is " + pivot);
            quickSort(data, left, pivot-1);
            quickSort(data, pivot+1, right);
        }
    }

    private static int headPartition(int[] data, int left, int right) {
        int pivot = data[left];
        int i = left;
        int j = left;
        while (j <= right) {
            System.out.println("i :" + i + " j : " + j);
            if (data[j] < pivot) {
                i++;
                swap(data, j, i);
            }
            j++;
            printArray(data);
        }
        swap(data, i, left);
        printArray(data);
        return i;
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
            printArray(data);
        }
        i++;
        swap(data, i, right);
        printArray(data);
        return i;
    }



    private static void swap(int[] data, int i, int j) {
        int step = data[i];
        data[i] = data[j];
        data[j] = step;
    }

    private static void printArray(int[] data) {
        System.out.println(Arrays.toString(data));
    }
}
