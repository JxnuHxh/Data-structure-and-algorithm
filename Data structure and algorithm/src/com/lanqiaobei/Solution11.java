package com.lanqiaobei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/4/15 20:55
 */
public class Solution11 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int j=0;j<n-1;j++){
            if((a[j+1]-a[j])==1){
                count++;
            }
        }
        System.out.println(count);
    }

}
