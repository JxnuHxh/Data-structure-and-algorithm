package com.bluebridge;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/3/2 0:19
 */
public class Blue12 {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        char[] chr=str.toCharArray();
        for(int i=0;i<chr.length;i++){
            if(chr[i]<='Z'&&chr[i]>='A'){
                System.out.print((char)(chr[i]+32));
            }
            if(chr[i]<='z'&&chr[i]>='a'){
                System.out.print((char)(chr[i]-32));
            }
        }

    }
}
