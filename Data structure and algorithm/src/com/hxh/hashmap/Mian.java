package com.hxh.hashmap;

public class Mian {
    public static void main(String[] args) {
        int[] a={2,7,11,15};
        TwoSum twoSum=new TwoSum();
       System.out.println(twoSum.twoSum(a,9)[0]+" "+twoSum.twoSum(a,9)[1]);
    }
}
