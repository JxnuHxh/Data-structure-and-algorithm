package com.leetCode;

//移除元素
public class Leetcode27 {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        // 定义指针 i 指向操作后元素对应的位置。
        int i = 0;
        // 从头开始遍历数组每个元素是否等于 val 。
        for (int j = 0; j < len; j++) {
            // 如果等于 val 则继续遍历，否则直到下一个不等于 val 值出现。
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
