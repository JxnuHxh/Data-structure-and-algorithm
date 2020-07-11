package com.程序员金典;

import java.util.HashSet;
import java.util.Set;

public class C0101 {
    public boolean isUnique(String astr) {
        Set<Character> set=new HashSet<>();
        for(Character c:astr.toCharArray()){
            if(!set.add(c))return false;
        }
        return true;
    }
}
