package com.leetCode;

import java.util.Arrays;

//最接近的三数之和
public class Leetcode16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            int start=i+1,end=nums.length-1;
            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(Math.abs(sum-target)<Math.abs(res-target)){
                    res=sum;
                } else if(sum<target){
                    start++;
                }else if(sum>target){
                    end--;
                }else{
                    return res;
                }
            }
        }
        return res;
    }
}
