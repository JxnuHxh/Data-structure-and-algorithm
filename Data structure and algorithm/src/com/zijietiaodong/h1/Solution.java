package com.zijietiaodong.h1;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.zijietiaodong.h1
 * @date 2020/2/6 15:02
 * 两数之和  也可使用HashMap
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i<=nums.length-2;i++)
            for (int j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        return result;
    }
}
