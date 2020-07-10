package com.leetcode;

import java.util.HashMap;
import java.util.Map;
//最长回文子串“

public class Leetcode409 {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int res=0, flag=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i), 1);
            }
        }

        for (Integer value : map.values()) {
            if((value&1)==1){
                res=res+value-1;
                flag=1;
            }else{
                res=res+value;
            }
        }
        return res+flag;
    }
}
