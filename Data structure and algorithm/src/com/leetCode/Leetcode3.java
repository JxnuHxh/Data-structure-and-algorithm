package com.leetCode;

public class Leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        int n = s.length();
        int res = 0;
        int start = 0;
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index]);
            res   = Math.max(res, i - start + 1);
            last[index] = i+1;
        }
        return res;
    }
}
