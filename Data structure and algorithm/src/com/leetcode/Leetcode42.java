package com.leetcode;
//接雨水
public class Leetcode42 {
    public int trap(int[] height) {
        if(height==null||height.length<1)return 0;
        int sum=0;
        int r=height.length-1,l=0;
        int r_max=height[r],l_max=height[l];
        while(l<r){
            if(height[l]<height[r]){
                l_max=Math.max(l_max,height[l+1]);
                sum+=(l_max-height[l+1]);
                l++;
            }else{
                r_max=Math.max(r_max,height[r-1]);
                sum+=(r_max-height[r-1]);
                r--;
            }
        }
        return sum;
    }
}
