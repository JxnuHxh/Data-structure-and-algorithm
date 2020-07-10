package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode305 {
    public List<Integer> countSmaller(int[] nums) {
        int[] res = new int[nums.length];
        int[] numsIndex = new int[nums.length];
        //初始化索引数组，绑定索引
        for(int i = 0; i < nums.length; i++)
            numsIndex[i] = i;
        mergeSort(nums, numsIndex, 0, numsIndex.length, res);
        //数组转列表
        List<Integer> res_ = new ArrayList<>();
        for(int i = 0; i < res.length; i++)
            res_.add(res[i]);

        return res_;
    }
    private void mergeSort(int[] nums, int[] numsIndex, int begin, int end, int[] res){
        if(end - begin < 2) return;
        int mid = begin + ((end-begin) >> 1);

        //分开排序
        mergeSort(nums, numsIndex, begin, mid, res);
        mergeSort(nums, numsIndex, mid, end, res);

        //合并
        int[] tmp = new int[mid - begin];
        for(int i = begin; i < mid; i++){
            tmp[i - begin] = numsIndex[i];
        }
        int p1 = 0;
        int p2 = mid;
        int index = begin;
        while(p1 < tmp.length && p2 < end){
            if(nums[tmp[p1]] <= nums[numsIndex[p2]]){
                //当前左边元素出列时，右边已经出去了多少个，就有多少个比当前左边元素小
                res[tmp[p1]] += p2 - mid;
                numsIndex[index++] = tmp[p1++];
            }else{
                numsIndex[index++] = numsIndex[p2++];
            }
        }
        while(p1 < tmp.length){
            res[tmp[p1]] += p2 - mid;
            numsIndex[index++] = tmp[p1++];
        }
    }
}
