package com.bluebridge;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/5/23 17:30
 */
public class Blue07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            T--;
            long n=sc.nextLong();
            double result =Math.sqrt(n);
            int c= (int) Math.floor(result);
            System.out.println(n-c);
        }
    }
    
}
