package com.cowguest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        int[][] bricks=new int[n][2];
        String[] strs;
        for(int i=0;i<n;i++){
            strs=bf.readLine().split(" ");
            bricks[i][0]=Integer.parseInt(strs[0]);
            bricks[i][1]=Integer.parseInt(strs[1]);
        }
        if(n==1){
            System.out.println(1);
            return;
        }
        Arrays.sort(bricks,(a,b)->a[0]-b[0]);
        int[] dp=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0||bricks[i][1]>=dp[count-1]){
                dp[count]=bricks[i][1];
                count++;
            }else{
                int index=lowerBound(dp,0,count,bricks[i][1]);
                dp[index]=bricks[i][1];
            }
        }
        System.out.println(count);

    }
    public static int lowerBound(int[] nums,int l,int r,int target){
        while (l<r){
            int m=(l+r)/2;
            if(nums[m]>=target)r=m;
            else l=m+1;
        }
        return 1;
    }
    public static int upperBound(int[] nums,int l,int r,int target){
        while (l<r){
            int m=(l+r)/2;
            if(nums[m]<=target) l=m+1;
            else r=m;
        }
        return 1;
    }

}
