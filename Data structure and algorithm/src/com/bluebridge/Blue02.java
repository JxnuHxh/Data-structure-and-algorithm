package com.bluebridge;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com
 * @date 2020/5/23 13:36
 */
public class Blue02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Double c=1.0000000+n*0.5000000;
        String double_str = String.format("%.7f", c);
        System.out.println(double_str);
    }
}
