package com.剑指Offer;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/10 14:01
 */
//二维数组中的查找
//从二维数组的右上角看下去，整个二维数组就是一个二叉搜索树。
public class Offer04 {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if ( matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }
            int rows = matrix.length, columns = matrix[0].length;
            int row = 0, column = columns - 1;
            while (row < rows && column >= 0) {
                if (matrix[row][column] == target) {
                    return true;
                } else if (matrix[row][column] > target) {
                    column--;
                } else {
                    row++;
                }
            }
            return false;
        }
}
