package com.leetcode;

public class Leetcode70 {
    public int climbStairs(int n) {
        if(n<4)return n;
        int[] sum=new int[n+1];
        sum[3]=5;
        sum[4]=8;
        for(int i=5;i<n;i++){
            sum[i]=sum[i-1]+sum[i-2];
        }
        return sum[n-1];
    }
}
