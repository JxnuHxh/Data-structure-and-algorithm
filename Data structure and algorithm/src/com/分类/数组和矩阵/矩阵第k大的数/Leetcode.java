package com.分类.数组和矩阵.矩阵第k大的数;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵.矩阵第k大的数
 * @date 2020/3/30 21:06
 */
public class Leetcode {
    int main(int[][] matrix, int k){
        int row=matrix.length-1,col=matrix[0].length-1;
        int mid=(matrix[0][0]+matrix[row][col])>>1;
        int count =0;
        for(int i=row;i>0;i--){
            for(int j=col;j>0;j--){
                if(mid>matrix[i][j]){
                    break;
                }
                count++;
            }
        }
        return 0;
    }
}
