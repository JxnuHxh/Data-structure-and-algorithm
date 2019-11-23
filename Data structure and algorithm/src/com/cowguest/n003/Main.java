package com.cowguest.n003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        long lena=text.length();
        long C=0;
        long N=0;
        for(int i=0;i<lena;i++){
            if(text.charAt(i)=='N'){
                N++;
            }
        }
        long ans=0;
        for(int i=0;i<lena;i++){
            if(text.charAt(i)=='C'){
                C++;
            }else if (text.charAt(i)=='H') ans+=C*N;
            else if (text.charAt(i)=='N') N--;
        }
        System.out.println(ans);
    }
}
