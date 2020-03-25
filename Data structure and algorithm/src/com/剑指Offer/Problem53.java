package com.剑指Offer;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/25 0:03
 */
public class Problem53 {
        public int missingNumber(int[] nums) {
            int i = 0, j = nums.length - 1;
            while(i <= j) {
                int m = (i + j)>>1;
                if(nums[m] == m) i = m + 1;
                else j = m - 1;
            }
            return i;
        }
    }
