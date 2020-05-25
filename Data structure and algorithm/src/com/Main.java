package com;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com
 * @date 2020/5/23 12:56
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        while(n>0){
            n--;
            int f=sc.nextInt();
            if(f<60)
                count++;
        }
        System.out.println(count*200);
    }
}
