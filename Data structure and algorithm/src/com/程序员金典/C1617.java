package com.程序员金典;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.程序员金典
 * @date 2020/5/25 17:49
 */
public class C1617 {
    public int massage(int[] nums) {
        nums[2]+=nums[0];
        for(int i=3;i<nums.length;i++){
            nums[i]=nums[i]+Math.max(nums[i-2],nums[i-3]);
        }
        return Math.max(nums[nums.length-1],nums[nums.length-2]);
    }

}
