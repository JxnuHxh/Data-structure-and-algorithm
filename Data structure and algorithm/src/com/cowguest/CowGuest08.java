package com.cowguest;

public class CowGuest08 {
    public int selectPresent (int[][] presentVolumn) {
        // write code here
        int N=presentVolumn.length;
        if(N==0) return 0;
        int M=presentVolumn[0].length;

        for(int row=0;row<N;row++){
            for (int col=0;col<M;col++){
                //Default state
                if(row==0&&col==0) continue;
                //第一行的只能左边来
                if(row==0)
                    presentVolumn[row][col]+=presentVolumn[row][col-1];
                //第一列只能上面来
                if(col==0)
                    presentVolumn[row][col]+=presentVolumn[row-1][col];
                //其他方式有两种 从左上
                if(col!=0&&row!=0){
                    presentVolumn[row][col]+=Math.min(Math.min(presentVolumn[row-1][col],presentVolumn[row][col-1]),presentVolumn[row-1][col-1]);
                }
            }
        }
        return presentVolumn[N-1][M-1];
    }
}
