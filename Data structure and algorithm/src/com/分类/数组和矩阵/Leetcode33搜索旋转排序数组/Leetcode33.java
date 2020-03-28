package com.分类.数组和矩阵.Leetcode33搜索旋转排序数组;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵.Leetcode33搜索旋转排序数组
 * @date 2020/3/28 14:39
 */
public class Leetcode33 {
    public int search(int[] nums, int target) {
        int high= nums.length-1,mid=nums.length>>1,low=0;
        if(nums[high]==target)return high;
        while(mid>low&&mid<high){
            if(nums[mid]>nums[low]){
                low=mid+1;
            }else{
                high=mid-1;
            }
            mid=(low+high)>>1;
        }
        if(target<nums[nums.length-1]){
            low=mid;
            high=nums.length-1;
        }else{
            low=0;
            high=mid-1;
        }
        while(mid>low&&mid<high){
            if(nums[mid]==target){
                return mid;
            }
            mid=(low+high)>>1;
        }
        return -1;
    }
}
