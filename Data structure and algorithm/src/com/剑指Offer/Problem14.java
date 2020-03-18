package com.剑指Offer;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/18 20:06
 */
public class Problem14 {
    public int cuttingRope(int n) {
        if(n<=3)return n-1;
        if(n%3==1){
            return (int) (Math.pow( 3,(n/3)-1)*4)%1000000007;
        }else if(n%3==2){
            return (int)(Math.pow(3,n/3)*2)%1000000007;
        }else{
            return (int)(Math.pow(3,n/3))%1000000007;
            }
    }
}
