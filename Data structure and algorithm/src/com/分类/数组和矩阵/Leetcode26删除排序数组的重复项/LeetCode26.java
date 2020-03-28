package com.分类.数组和矩阵.Leetcode26删除排序数组的重复项;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵.Leetcode26删除排序数组的重复项
 * @date 2020/3/28 11:07
 */
public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[count]!=nums[i])
                count++;
            nums[count]=nums[i];
        }
        return count;
    }
}
