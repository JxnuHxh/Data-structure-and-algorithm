package com.hxh.hashmap;

import com.hxh.hashcode.HashTest;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] numbers,int targer){
        int[] indexArray = new int[2];
        if(numbers==null||numbers.length==0)
        {
            return null;

        }
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            hashMap.put(numbers[i],i);

        }
        for(int i=0;i<numbers.length;i++)
        {
            if(hashMap.containsKey(targer-numbers[i]))
            {
                indexArray[0]=i;
                indexArray[1]=hashMap.get(targer-numbers[i]);
            }
            if(indexArray[0]==indexArray[1])
                continue;
            return indexArray;
        }
        return null;
    }
}
