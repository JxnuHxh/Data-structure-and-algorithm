package com.leetcode;

public class Leetcode9 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int len=nums.length;
        for(int j=1;j<len;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Leetcode9 leetcode9=new Leetcode9();
        leetcode9.removeDuplicates(new int[] {1,1,2});
    }
}
