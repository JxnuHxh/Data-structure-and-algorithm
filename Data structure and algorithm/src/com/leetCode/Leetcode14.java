package com.leetCode;

public class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        int length=strs[0].length();
        int l=strs.length;
        for(int i=0;i<length;i++) {
            char c=strs[0].charAt(i);
            for(int j=0;j<l;j++){
                if(i==strs[j].length()||c!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }

        }
        return strs[0];
    }
}
