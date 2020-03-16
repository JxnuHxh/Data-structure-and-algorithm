package com.剑指Offer;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/14 21:20
 */
public class Problem13 {
    public int movingCount(int m, int n, int k) {
        int[][] visited = new int[m][n];
        return dfs(0, 0, m, n, visited, k);
    }

    private int dfs(int i, int j, int m, int n, int[][] visited, int k) {
        if (add(i, j) > k || i > m - 1 || j > n - 1 || visited[i][j] == 1) {
            return 0;
        }
        visited[i][j] = 1;
        return 1 + dfs(i + 1, j, m, n, visited, k) + dfs(i, j + 1, m, n, visited, k);
        //这里+1是因为默认0，0是可以访问到的
    }

    private int add(int a, int b) {
        int result = 0;
        while (a != 0) {
            result += a % 10;
            a /= 10;
        }
        while (b != 0) {
            result += b % 10;
            b /= 10;
        }
        return result;
    }
}
