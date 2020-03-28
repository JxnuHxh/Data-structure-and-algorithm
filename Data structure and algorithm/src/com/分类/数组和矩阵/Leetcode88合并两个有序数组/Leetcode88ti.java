package com.分类.数组和矩阵.Leetcode88合并两个有序数组;
import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵.Leetcode88合并两个有序数组
 * @date 2020/3/28 20:49
 */
public class Leetcode88ti {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}
