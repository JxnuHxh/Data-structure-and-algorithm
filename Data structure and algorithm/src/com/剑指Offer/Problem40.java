package com.剑指Offer;

import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/20 18:04
 * 最小的k个数
 */
public class Problem40 {
    //利用快排思想，每次只处理一个部分
    //补充：实际下标为k-1，但获取前k+1个也就获取了k个，-1操作反而消耗额外时间
    //实际结果，将k换为k-1，时间消耗从2ms上升至3ms
    //具体思路：
    //当快排后的枢纽位置在k，恰好左边部分为要求的k+1个数
    //当枢纽位置小于k，前几个数字已经确定，需要确定后几个数字，令low = pivot + 1继续
    //当枢纽位置大于k，前k个数字在枢纽前，在枢纽前寻找数字，令high = pivot - 1继续
    //下面讨论low < high作为循环结束条件的合理性：
    //一般情况下，若k小于数组长度，low必然<=k，high必然>=k
    //由于pivot == k时直接结束循环不考虑，因此只有可能出现low == high == k
    //要使得上式成立，必然有两个状态满足pivot1==k-1和pivot2==k+1
    //pivot1前的部分必然是小于k的，而pivot2后的部分必然是大于k的
    //因此可以确定k是pivot1后数字中最小的一个，可以确定前k+1个数字已满足要求
    //特殊情况下，k等于数组长度。此时pivot < k始终成立，也就是pivot!=k
    //每趟处理后，必然有low = pivot + 1，也就是low必然会移动到满足low>=high
    //由于k等于数组长度，因此无论如何变动，取出的数组一定满足要求
    private int partition(int[] nums,int low,int high){
        int pivot = nums[low];
        while(low < high){
            while(low < high && nums[high] >= pivot)
                --high;
            nums[low] = nums[high];
            while(low < high && nums[low] <= pivot){
                ++low;
                nums[high] = nums[low];
            }
            nums[high] = nums[low];
        }
        nums[low] = pivot;
        return low;
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int pivot = partition(arr,low,high);
            if(pivot > k)  high = pivot - 1;
            if(pivot < k)  low = pivot + 1;
            if(pivot == k)  break;
        }
        return Arrays.copyOf(arr,k);
    }
}
