package com.剑指Offer;
import java.util.HashMap;
import java.util.Map;
/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/5/27 15:34
 */
public class Problem5 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res=0,i=-1;
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j)))
                i = Math.max(i, map.get(s.charAt(j)));
            map.put(s.charAt(j),j);
            res=Math.max(res,j-i);
        }
   
        return res;
    }
    public static void main(String[] args) {
        Problem5 problem5=new Problem5();
        System.out.println(problem5.lengthOfLongestSubstring("dvdf"));
    }
}
