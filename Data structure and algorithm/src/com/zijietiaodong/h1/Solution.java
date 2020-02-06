package com.zijietiaodong.h1;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.zijietiaodong.h1
 * @date 2020/2/6 15:02
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i<=nums.length-2;i++)
            for (int j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;

                }

            }
        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums={2, 7, 11, 15};
        int[] n=s.twoSum( nums, 9);
        System.out.println(n[0]+" "+n[1]);
    }
}
