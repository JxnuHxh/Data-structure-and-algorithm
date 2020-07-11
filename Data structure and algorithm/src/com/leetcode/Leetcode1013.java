package com.leetcode;

public class Leetcode1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        for(int a:A)sum+=a;
        int c=sum/3,j=0;
        if((sum%3)!=0)return false;
        sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            if(sum==c){
                sum=0;
                j++;
            }
        }
        return (j>=3)&&(sum==0);
    }
}
