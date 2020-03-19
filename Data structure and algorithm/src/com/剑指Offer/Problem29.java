package com.剑指Offer;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/19 20:52
 */
public class Problem29 {
    public int[] spiralOrder(int[][] matrix) {
        int[][] dirct = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        int[] ans = new int[matrix.length * matrix[0].length];
        int it = 0;
        int verticalStep = matrix.length;       //垂直方向应走步数
        int parallelStep = matrix[0].length;        //平行方向应走步数
        int step = parallelStep;                    //一开始应该是平行走
        int dirctIdx = 0;
        int i, j;
        i = 0;
        j = -1;
        while(step > 0){
            while(step-- > 0){
                i = i + dirct[dirctIdx][0];
                j = j + dirct[dirctIdx][1];
                ans[it++] = matrix[i][j];
            }
            dirctIdx = (dirctIdx + 1) % 4;
            if(dirctIdx % 2 == 0){
                parallelStep--;
                step = parallelStep;
            }else{
                verticalStep--;
                step = verticalStep;
            }
        }
        return ans;
    }
}
