package com.lanqiaobei;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/4/14 20:48
 */
public class Solution9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        int t=sc.nextInt();
        int s=sc.nextInt();
        int l=sc.nextInt();
        int R=v1,T=v2,S=1;
        while(Math.max(R,T)<l){
            if((R-T)>=t){
                for(int i=0;i<s;i++){
                    T += v2;
                    S++;
                    if(T == l)//乌龟到达终点
                        break;
                }
            }else{
                R+=v1;
                T+=v2;
                S++;
            }
        }
        if(R>T){
         System.out.println("R");
        }else if(R==T){
            System.out.println("D");
        }else{
            System.out.println("T");
        }
        System.out.print(S);
    }
}
