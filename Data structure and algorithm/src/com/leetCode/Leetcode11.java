package com.leetCode;

public class Leetcode11 {
        public int maxArea(int[] height) {
            int sum=0;
            int right=height.length-1;
            int left=0;
            while(left<right){
                if(height[left]>height[right]){
                    sum=Math.max(sum,height[right]*(right-left));
                    right--;
                }else{
                    sum=Math.max(sum,height[left]*(right-left));
                    left++;
                }
            }
            return sum;
            
        }
}
