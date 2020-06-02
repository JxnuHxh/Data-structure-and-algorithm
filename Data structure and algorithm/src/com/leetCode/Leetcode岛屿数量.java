package com.leetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author atom.hu
 *
 *
 *
 * BFS岛屿数量
 * @version V1.0
 * @Package com.leetCode
 * @date 2020/6/1 22:20
 */
public class Leetcode岛屿数量 {
    public int numIslands(char[][] grid) {
        int result =0;
       for (int i=0; i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]=='1'){
                   bfs(grid,i,j);
                   result++;
               }
           }
       }
       return result;
    }
    private void bfs(char[][] grid,int i,int j){
        Queue<int[]> list=new LinkedList<>();
        list.add(new int[]{i,j});
        while(!list.isEmpty()){
            int[] cur=list.remove();
            i=cur[0];j=cur[1];
            if(0 <= i && i < grid.length && 0 <= j && j < grid[0].length && grid[i][j] == '1') {
                grid[i][j] = '0';
                list.add(new int[] { i + 1, j });
                list.add(new int[] { i - 1, j });
                list.add(new int[] { i, j + 1 });
                list.add(new int[] { i, j - 1 });
            }

        }
    }


}

