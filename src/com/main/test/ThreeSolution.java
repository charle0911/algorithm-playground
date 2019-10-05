package com.main.test;

import java.util.HashSet;
import java.util.Set;

public class ThreeSolution {

    /**
     * Define a set to clear the duplicate element. Set return true when element is already alive in set.
     * This method is classic that use space to change time.
     * @param
     * @return
     * @throw
     */
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        Set<Integer> stepSet = new HashSet<>();
        for (int number : numbers) {
            if (stepSet.contains(number)) {
                duplication[0] = number;
                return true;
            }
            stepSet.add(number);
        }
        return false;
    }

    /**
     * Use the question feature to solute it. Numbers in this array will have a sole space to be stored.
     * @param
     * @return
     * @throw
     */
    public boolean duplicateWithSwap(int numbers[],int length,int [] duplication) {
        for (int i = 0; i <length; i++) {
            while (numbers[i] != i) {
                if (numbers[numbers[i]] == numbers[i]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers, i, numbers[i]);
            }
        }
        return false;
    }

    public void swap(int[] numbers, int i, int j) {
        int step = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = step;
    }

    public static void main(String[] args) {
        int[] inputData = {2,3,1,0,2,5,3};
        int[] duplicate = {0};
        ThreeSolution test = new ThreeSolution();
        test.duplicate(inputData, inputData.length, duplicate);
        System.out.println(duplicate[0]);
        test.duplicateWithSwap(inputData, inputData.length, duplicate);
        System.out.println(duplicate[0]);
    }
}
