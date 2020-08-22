package com.排序算法;
//快排单边循环
public class Qk {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,9,2,3,89};
        Qk.kp(0,a.length-1,a);
        for(int c:a){
            System.out.print(c+" ");
        }
    }
    private static void   kp(int start,int end,int[] nums){
        if(start>end) return ;
        int base=nums[start],count=start;
        for(int i=start+1;i<=end&&count<end;i++) {
            if (nums[i] <base) {
                count++;
                int temp=nums[count];
                nums[count]=nums[i];
                nums[i]=temp;
            }
        }
        nums[start] = nums[count];
        nums[count] = base;
        kp(start,count-1,nums);
        kp(count+1,end,nums);
    }
}
