package com.lanqiaobei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/4/16 15:57
 */
public class Solution12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int count=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int m=0;m<n;m++) {
            for (int j = 0; j < n; j++) {
                if (a[j] != j + 1) {
                    list.add(a[a[j]-1]);
                    list.add(a[j]);
                   int temp=a[j];
                   a[j]=a[a[j]-1];
                   a[temp-1]=temp;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        int b=0;
        while (count>0) {
            System.out.println(list.get(b) + " " + list.get(b+1));
            b=b+2;
            count--;
        }

    }
}
