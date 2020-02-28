package com.lanqiaobei;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/2/28 0:36
 */
public class Solutuion1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt(); //定义自己在键盘中键入一个数字
            int mod = 10007; //定义要除的除数mod
            int []a;
            a = new int[1000000];//确定数组的大小范围
            a[1] = a[2] = 1;//斐波那契数列前两项为1
            for(int i = 3;i<=x;i++){//通过循环来确定第x项的数值，并%mod
                a[i] = (a[i-1]+a[i-2])%mod;
            }
            System.out.println(a[x]);
        }
    }


