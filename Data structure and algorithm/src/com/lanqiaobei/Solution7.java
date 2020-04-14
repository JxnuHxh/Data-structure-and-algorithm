package com.lanqiaobei;

import com.hxh.DG.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/4/11 15:42
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List arr=new ArrayList();
        int n=sc.nextInt();
        int sum=1;
        for(int i=2;i<=n;i++){
            sum=sum*i;
            while(sum>=10){
                sum=sum/10;
            }
        }
        System.out.print(sum);
    }
}
