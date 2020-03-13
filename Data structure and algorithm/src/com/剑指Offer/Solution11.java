package com.剑指Offer;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/13 21:53
 */
public class Solution11 {
    public int minArray(int[] numbers) {
        int temp=numbers[0],j=numbers.length-1;
        for(int i=0;i<numbers.length;i++){
            temp=Math.min(temp,numbers[i]);
            temp=Math.min(temp,numbers[j--]);
            if(j<=i)
                break;
        }
        return temp;
    }
}
