package com.分类.链表.LeetCode21合并两个有序链表;

import com.cowguest.Main;
import com.hxh.DG.ListNode;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.链表.LeetCode21合并两个有序链表
 * @date 2020/4/4 8:32
 */
public class Leetcoed21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
        while(t>0){
            t--;
            int result=0;
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
           int sum=n*b;
           int c=sum/a;
           if((sum%a)!=0){
               result=m-c-1;
           }else{
               result=m-c;
           }
           System.out.print(m-result);
        }
    }
}
