package com.hxh;

import sun.applet.Main;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.List;
//寻找缺失范围
public class Question1 {
    private  static List<String > findMissingRanges(int[] nums,int lower,int upper)
    {
        //1 定义输出变量
        List<String > rst=new ArrayList<>();
        //2
        if(nums==null||nums.length==0)
        {
            rst.add(lower+"->"+upper);
            return rst;
        }
        addToList(rst,lower,nums[0]-1);
        int prev = nums[0];
        int i=1;
        while(i<nums.length){
            int cur=nums[i];
            if(cur!=prev+1){
                addToList(rst,prev+1,cur+1);
            }
            prev=cur;
            i++;
        }
        addToList(rst,nums[nums.length-1]+1,upper);

        return rst;

    }
    private  static  void addToList(List<String> rst,int start,int end){
        if(start==end)
        {
            rst.add(String.valueOf(start));
        }else if(start<end)
        {
            rst.add(start+"->"+end);
        }

    }

    public static void main(String[] args) {
        int[] nums={0,1,3,50,75};
        List<String> rst=findMissingRanges(nums,0,99);
        System.out.println(rst.toString());
    }

}
