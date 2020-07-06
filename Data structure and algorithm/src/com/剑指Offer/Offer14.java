package com.剑指Offer;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/18 21:13
 */
public class Offer14 {
    public int cuttingRope(int n) {
        if(n<=3) return n-1;
        long res = 1;
        while(n>4){
            n -= 3;
            res = (res*3)%1000000007;
        }
        return (int)(res*n%1000000007);
    }
}
