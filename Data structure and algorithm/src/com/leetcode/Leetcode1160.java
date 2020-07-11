package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1160 {
    public int countCharacters(String[] words, String chars) {
        int len=0;
       char[] chars1= chars.toCharArray();
        List<Character> l1=new ArrayList<>();
        List<Character> list=new ArrayList<>();
        for(int i=0;i<chars1.length;i++){
            list.add(chars1[i]);
        }
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                l1.add(words[i].charAt(j));
            }
            if(list.containsAll(l1))len+=words[i].length();
            l1.clear();
        }
        return len;
    }
}
