package com.leetCode;

import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.leetCode
 * @date 2020/5/12 23:45
 */
public class Leetcode58 {
    public String reverseLeftWords(String s, int n) {

        char[] a=s.toCharArray();
        char[] b=new char[s.length()];
        System.arraycopy(a,0,b,s.length()-n,s.length());
        System.arraycopy(a,n,b,0,n-1);
        s= Arrays.toString(b);
        return s;
    }
}
/*
The rapid development of Internet finance has profoundly affected China’s financial structure. As the indirect financing of banks is the main financing channel for China’s economy, the number of comme

 互联网金融的飞速发展对中国的金融结构产生了深远的影响。由于银行的间接融资是中国经济的主要融资渠道，因此*/
