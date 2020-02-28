package com.lanqiaobei;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/2/28 21:37
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long m=0;
            m = ((n + 1) * n )/2;
        System.out.println(m);
    }
}
