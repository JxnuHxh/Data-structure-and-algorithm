package com.分类.数组和矩阵.Leetcode628三个数的最大乘积;

import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵.Leetcode628三个数的最大乘积
 * @date 2020/3/28 13:56
 */
public class Leetcode628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
                nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
