package com.剑指Offer;
import java.util.HashSet;
import java.util.Set;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/8 22:05
 */
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set =new HashSet();
        int temp=0;
        for(Integer num:nums){
            if(!set.add(num)){
                temp=num;
                break;
            }
        }
        return temp;
    }
}
