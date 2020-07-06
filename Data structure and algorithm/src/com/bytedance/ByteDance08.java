package com.bytedance;

public class ByteDance08 {
    int X,Y;
    // 用于向四周访问
    int[] xarr = {1, -1, 0, 0};
    int[] yarr = {0, 0, -1, 1};
    public int maxAreaOfIsland(int[][] grid) {
        // 获取X和Y
        X = grid.length;
        Y = grid[0].length;
        int ans = 0;

        // 遍历整个数组
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {

                // 出现了陆地则进行深搜
                if (grid[i][j] == 1) {
                    int sum = dfs(grid, i, j);

                    // 选出最大的面积
                    if (sum > ans) {
                        ans = sum;
                    }
                }
            }
        }
        return ans;
    }
    public int dfs(int[][] grid, int i, int j) {
        int sum = 1; // 能进入该方法，岛屿面积默认为1
        grid[i][j] = 0;   // 访问了，则将该陆地变为海洋

        // 向四周访问
        for (int k = 0; k < 4; k++) {
            int x = i + xarr[k];
            int y = j + yarr[k];

            if (x >= 0 && x < X && y >= 0 && y < Y && grid[x][y] == 1) {
                sum += dfs(grid, x, y);
            }
        }
        return sum;
    }
}
