package com.lanqiaobei;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com
 * @date 2020/5/23 16:01
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            String a=sc.nextLine();
            int t=Integer.parseInt(a);
                while(t>0){
                    t--;
                    int count=0;
                    String str=sc.nextLine();
                    char[] c=str.toCharArray();
                    count=str.length();
                    for(int i=0;i<str.length()-1;i++){
                        for (int j=i+1;j<=str.length()-1;j++){
                            int m=i,n=j;
                            while(m<n){
                                if(c[m]!=c[n])
                                    break;
                                m++;
                                n--;
                            }
                            if(m>=n)
                                count++;
                        }
                    }
                    System.out.println(count);
                }
        }

}
