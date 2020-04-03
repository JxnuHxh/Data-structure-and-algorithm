package com.分类.数组和矩阵.Leetcode581最短无序子数组;

import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵.Leetcode581最短无序子数组
 * @date 2020/4/3 15:43
 */
public class LeetCode581 {
    public int findUnsortedSubarray(int[] nums) {
       int[] snums=nums.clone();
        Arrays.sort(nums);
        int count=0,stop=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=snums[i]){
                count=i;
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=snums[i]){
                stop=i;
            }
        }
       return stop-count;
    }
}
