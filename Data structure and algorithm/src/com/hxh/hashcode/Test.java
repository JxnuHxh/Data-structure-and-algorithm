package com.hxh.hashcode;

import java.util.HashMap;

public class Test {
    public static void main (String[] args){
        HashTest p1=new HashTest("jack",12);
        System.out.println(p1.hashCode());
        HashMap<HashTest,Integer> hashMap=new HashMap<>();
        hashMap.put(p1,1);
        System.out.println(hashMap.get(new HashTest("jack",12)));
    }
}
