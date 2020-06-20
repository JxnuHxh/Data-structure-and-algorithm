package com.leetCode;

public class L3 {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int[] last=new int[128];
        int start=0;
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i);
            start=Math.max(start,last[index]);
            res=Math.max(res,i-start+1);
            last[index]=i+1;
        }
        return res;
    }

    public static void main(String[] args) {
        L3 l3=new L3();
        l3.lengthOfLongestSubstring("fhadda");
    }
}
