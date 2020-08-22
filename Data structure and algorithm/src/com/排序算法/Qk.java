package com.排序算法;
//快排单边扫描
public class Qk {
    public static void main(String[] args) {
        int[] a=new int[]{3,1,2,9,2,3,89};
        Qk.kps(0,a.length-1,a);
        for(int c:a){
            System.out.print(c+" ");
        }
    }
    //单边扫描
    private static void  kpd(int start,int end,int[] nums){
        if(start>end) return;
        int count=start;
        int base=nums[start];
        for(int i=start+1;i<=end;i++){
            if(nums[i]<base){
                count++;
                int temp = nums[count];
                nums[count]=nums[i];
                nums[i]=temp;
            }
        }
        nums[start]=nums[count];
        nums[count]=base;
        kpd(start,count-1,nums);
        kpd(count+1,end,nums);
    }
    //双边扫描
    private static void kps(int start,int end,int[] nums){
        if(start>end) return;
        int base=nums[start];
        int i=start,j=end;
        while (i!=j){
            while (base<nums[j]&&i<j)j--;
            while (base>=nums[i]&&i<j)i++;
            if(i<j){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        nums[start]=nums[i];
        nums[i]=base;
        kps(start,i-1,nums);
        kps(i+1,end,nums);
    }
}
