package com.leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/16 22:02
 */
public class Problem42 {
        public int firstMissingPositive(int[] nums) {
            if (nums==null||nums.length==0)return 1;
            int temp=0;
            for (int i = 0; i < nums.length; i++) {
                while (nums[i]>0&&nums[i]<nums.length&&nums[i]!=nums[nums[i]]){
                    temp=nums[nums[i]];
                    nums[nums[i]]=nums[i];
                    nums[i]=temp;
                }
            }
            for (int i = 1; i < nums.length; i++) {
                if (nums[i]!=i)return i;
            }
            if (nums[0]==nums.length)return nums.length+1;
            return nums.length;
        }
    }

