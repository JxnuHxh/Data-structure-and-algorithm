package com.leetcode;

public class Leetcode41 {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //如果在指定的位置就不需要修改
            if (i + 1 == nums[i])
                continue;
            int x = nums[i];
            if (x >= 1 && x <= nums.length && x != nums[x - 1]) {
                swap(nums, i, x - 1);
                i--;//抵消上面的i++，如果交换之后就不++；
            }
        }
        //最后在执行一遍循环，查看对应位置的元素是否正确，如果不正确直接返回
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i])
                return i + 1;
        }
        return nums.length + 1;
    }

    //交换两个数的值
    public void swap(int[] A, int i, int j) {
        if (i != j) {
            A[i] ^= A[j];
            A[j] ^= A[i];
            A[i] ^= A[j];
        }
    }
}
