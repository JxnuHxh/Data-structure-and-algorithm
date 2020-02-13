package com.zijietiaodong.h1;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.zijietiaodong.h1
 * @date 2020/2/13 23:01
 */
public class Solution9 {
    public int trap(int[] height){
        int sum=0,min=0;
        int[] max_left=new int[height.length];
        int[] max_right=new int[height.length];
        for(int i=1;i<height.length-1;i++){
            max_left[i]=Math.max(max_left[i-1],height[i-1]);
        }
        for(int j=height.length-2;j>=0;j--){
            max_right[j]=Math.max(max_right[j+1],height[j+1]);
        }
        for(int i=1;i<height.length-1;i++){
            min=Math.min(max_left[i],max_right[i]);
            if(min>height[i]){
                sum+=(min-height[i]);
            }
        }
        return sum;
    }
}
