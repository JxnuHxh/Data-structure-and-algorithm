package com.leetCode;
//分糖果
public class Leetcode1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res=new int[num_people];
        int count=0,t=1;
        while(candies>t){
            res[count]=res[count]+t;
            candies=candies-t;
            if(count==num_people-1)count=-1;
            count++;t++;
        }
        return res;
    }
}
