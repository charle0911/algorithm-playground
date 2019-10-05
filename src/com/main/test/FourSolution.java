package com.main.test;

public class FourSolution {
    public boolean soultion(int[][] inputData, int target) {
        int y = 0;
        int x = inputData[y].length-1;
        while ((x > 0) || (y < inputData.length-1)) {
            if (target == inputData[x][y]) {
                return true;
            } else if (target > inputData[x][y]) {
                y++;
            } else {
                x--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] inputData = {
        {1,   4,  7, 11, 15},
        {2,   5,  8, 12, 19},
        {3,   6,  9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}};
        int target = 17;
        FourSolution solution = new FourSolution();
        if (solution.soultion(inputData, target)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
