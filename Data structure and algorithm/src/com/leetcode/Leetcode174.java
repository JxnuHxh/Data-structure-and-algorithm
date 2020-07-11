package com.leetcode;

public class Leetcode174 {
    public int calculateMinimumHP(int[][] dungeon) {
        int rows=dungeon.length,columns=dungeon[0].length;
        for(int i=1;i<columns;i++){
            dungeon[0][i]=dungeon[0][i-1]+dungeon[0][i];
        }
        for(int i=1;i<rows;i++){
            dungeon[i][0]=dungeon[i-1][0]+dungeon[i][0];
        }
        for()

        return dungeon[rows-1][columns-1];
    }
}
