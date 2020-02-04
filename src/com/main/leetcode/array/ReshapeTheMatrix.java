package com.main.leetcode.array;

/**
 * 566. Reshape the Matrix
 *
 * https://leetcode.com/problems/reshape-the-matrix/
 *
 * @author : Charlie Lee
 * @codeby : IDEA
 * @since : 2020/2/4
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int nR = nums.length;
        int nC = nums[0].length;
        if (nC * nR < r * c) {
            return nums;
        }

        int[][] result = new int[r][c];

        int index = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = nums[index/nC][index%nC];
                index++;
            }
        }

        return result;
    }
}
