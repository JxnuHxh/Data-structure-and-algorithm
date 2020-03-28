package com.分类.数组和矩阵.Leetcode35搜索插入位置;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵.Leetcode35搜索插入位置
 * @date 2020/3/28 18:39
 */
public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
          int left=0,right=nums.length-1,mid = 0;
          while(left<=right){
              mid=(left+right)>>1;
              if(nums[mid]==target){
                  return mid;
              }else if(nums[mid]<target){
                  left=mid+1;
              }else{
                  right=mid-1;
              }
          }
          return left;
    }
}
