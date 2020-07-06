package com.leetCode;
//寻找两个正序数组的中位数
//不需要合并两个有序数组，只要找到中位数的位置即可。由于两个数组的长度已知，
// 因此中位数对应的两个数组的下标之和也是已知的。维护两个指针，初始时分别指向
// 两个数组的下标 00 的位置，每次将指向较小值的指针后移一位（如果一个指针已经
// 到达数组末尾，则只需要移动另一个数组的指针），直到到达中位数的位置。

public class Leetcode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];//两个数组合并后的有序数组
        int nums1Index = 0;
        int nums2Index = 0;
        int numsIndex = 0;
        if(nums1.length == 0 && nums2.length != 0){
            nums = nums2;
        }else if(nums1.length != 0 && nums2.length == 0){
            nums = nums1;
        }else{//如果两个数组都不为空
            do{
                if(nums1Index == nums1.length){//第一个数组查找完毕
                    for(int i = nums2Index; i < nums2.length; i++){
                        nums[numsIndex] = nums2[i];
                        numsIndex++;
                    }
                    break;
                }else if(nums2Index == nums2.length){//第二个数组查找完毕
                    for(int i = nums1Index; i < nums1.length; i++){
                        nums[numsIndex] = nums1[i];
                        numsIndex++;
                    }
                    break;
                }else{//比较两个数组数据元素大小，依次加到合并数组
                    if(nums1[nums1Index] <= nums2[nums2Index]){
                        nums[numsIndex] = nums1[nums1Index];
                        nums1Index++;
                    }else{
                        nums[numsIndex] = nums2[nums2Index];
                        nums2Index++;
                    }
                    numsIndex++;
                }
            }while(numsIndex != nums.length);
        }

        if(nums.length % 2 == 0){//偶数个元素
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        }else{//奇数个元素
            return nums[nums.length / 2];
        }
    }
}
