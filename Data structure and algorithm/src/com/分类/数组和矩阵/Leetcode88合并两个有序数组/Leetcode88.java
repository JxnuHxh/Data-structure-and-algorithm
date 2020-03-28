package com.分类.数组和矩阵.Leetcode88合并两个有序数组;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵.Leetcode88合并两个有序数组
 * @date 2020/3/28 20:29
 */
public class Leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1=m-1,l2=n-1,len=nums1.length-1;
        while(len>0){
            if(nums1[l1]>nums2[l2]){
                nums1[len]=nums1[l1];
                l1--;
            }else{
                nums1[len]=nums2[l2];
                l2--;
            }
            len--;
        }
    }
}
