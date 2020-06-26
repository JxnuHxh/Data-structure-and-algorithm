package com.lanqiaobei;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com
 * @date 2020/5/23 17:22
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int a=0;
            T--;
            long n=sc.nextLong();
            for(int j=1;j<=n;j++){
                int count=0;
                for(int i=1;i<=j;i++){
                    if(j%i==0)
                        count++;
                }
                if(count%2==0)
                    a++;
            }
            System.out.println(a);
        }
    }
}
