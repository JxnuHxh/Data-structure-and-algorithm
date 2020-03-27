package com.分类.数组和矩阵.Leetcode4寻找两个有序数组的中位数;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵.Leetcode4寻找两个有序数组的中位数
 * @date 2020/3/26 21:05
 */
public class LeetCode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int left=(m+n+1)/2;
        int right=(m+n+2)/2;
        return (findKth(nums1,0,nums2,0,left)+findKth(nums1,0,nums2,0,right))/2.0;
    }
    private int findKth(int[] nums1,int i, int[] nums2,int j,int k){
        if(i>=nums1.length)return nums2[j+k-1];
        if(j>=nums2.length)return nums1[1+k-1];
        if(k==1){
            return Math.min(nums1[i],nums2[j]);
        }
        int midVal1=(1+k/2-1<nums1.length)? nums1[i+k/2-1]:Integer.MAX_VALUE;
        int midVal2=(j+k/2-1<nums2.length)? nums2[j+k/2-1]:Integer.MAX_VALUE;
        if(midVal1<midVal2){
            return findKth(nums1,i+k/2,nums2,j,k-k/2);
        }else{
            return findKth(nums1,i,nums2,j+k/2,k-k/2);
        }
    }
}
