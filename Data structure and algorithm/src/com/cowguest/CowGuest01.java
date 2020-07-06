package com.cowguest;

import java.util.Scanner;
//数字反转
//给定一个整数，请将该数各个位上数字反转得到一个新数。
// 新数也应满足整数的常见形式，即除非给定的原数为零，
// 否则反转后得到的新数的最高位数字不应为零（参见样例2）
public class CowGuest01 {
    public static void main(String[] args) {
        Scanner input =new Scanner( System.in);
        String num = input.next();
        if (num.length()==1&&num.charAt(0)=='0'){
            System.out.println(0);
            return;
        }
        int start=0,end=num.length()-1;
        if(num.charAt(0)=='-'){
            start=1;
            System.out.print("-");
            while (num.charAt(end)=='0')
                end--;
            while (end>=start){
                System.out.print(num.charAt(end));
                end--;
            }
        }
        else{
            while(num.charAt(end)=='0')
                end--;
            while(end>=start){
                System.out.print(num.charAt(end));
                end--;
            }
        }
        input.close();
    }
}
