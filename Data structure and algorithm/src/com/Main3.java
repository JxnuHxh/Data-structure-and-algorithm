package com;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com
 * @date 2020/5/23 13:53
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int[] a=new int[1000000];
        for(int j=1;j<1000000;j++){
            a[j]=j*j;
        }
        while(T>0){
            T--;
            long n=sc.nextLong();
            for(int i=0;i<n;i++){
                if((i*i)<=n&&((i+1)*(i+1)>n)){
                    n=n-i;
                    break;
                }
            }
            System.out.println(n);
        }
    }
}
