package com.分类.数组和矩阵.Leetcode63股票的最大利润;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵.Leetcode63股票的最大利润
 * @date 2020/3/30 21:56
 */
public class Leetcode63 {
    public int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        int p=prices[0],sum=0;
        for(int i=1;i<=prices.length-1;i++){
            if(p>prices[i]){
                p=prices[i];
            }else {
                sum=Math.max(sum,prices[i]-p);
            }
        }
        return sum;
    }
}
