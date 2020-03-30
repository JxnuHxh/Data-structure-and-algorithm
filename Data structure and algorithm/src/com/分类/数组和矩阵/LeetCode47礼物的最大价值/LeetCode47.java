package com.分类.数组和矩阵.LeetCode47礼物的最大价值;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵.LeetCode47礼物的最大价值
 * @date 2020/3/30 23:18
 */
public class LeetCode47 {
    public int maxValue(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        for (int i = 1; i < row; ++i) {
        grid[i][0] += grid[i-1][0];
        }
        for (int i = 1; i < col; ++i) {
        grid[0][i] += grid[0][i-1];
        }
        for (int i = 1; i < row; ++i) {
        for (int j = 1; j <col; ++j) {
        grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
        }
        }
        return grid[row-1][col-1];
        }
        }
