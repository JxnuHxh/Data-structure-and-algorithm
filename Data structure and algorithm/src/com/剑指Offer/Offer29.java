package com.剑指Offer;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/19 20:52
 */
public class Offer29 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0];
        int row = matrix.length;
        int col = matrix[0].length;
        int allNum = row * col;
        int[] ans = new int[allNum];
        int up = 0, down = row - 1, left = 0, right = col - 1;
        int i = 0, j = 0, n = 0;
        int time = 0;
        while (n < allNum) {
            if (time == 0) {
                ans[n++] = matrix[i][j++];
                if (j > right) {
                    i++;
                    j--;
                    time++;
                    up++;
                }
            } else if (time == 1) {
                ans[n++] = matrix[i++][j];
                if (i > down) {
                    j--;
                    i--;
                    time++;
                    right--;
                }
            } else if (time == 2) {
                ans[n++] = matrix[i][j--];
                if (j < left) {
                    i--;
                    j++;
                    time++;
                    down--;
                }
            } else if (time == 3) {
                ans[n++] = matrix[i--][j];
                if (i < up) {
                    j++;
                    i++;
                    time = 0;
                    left++;
                }
            }
        }
        return ans;
    }
}
