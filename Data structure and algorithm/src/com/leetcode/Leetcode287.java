package com.leetcode;

import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.leetCode
 * @date 2020/5/26 16:39
 */
public class Leetcode287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }

}
