package com.剑指Offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/24 22:42
 */
public class Offer50 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("abaccdeff"));
    }
    public static char firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i = 0 ;i < s.length(); i++ ){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i = 0 ;i < s.length(); i++ ){
            if(map.get(s.charAt(i))==1)return s.charAt(i);
        }
        return  ' ';
    }
}
