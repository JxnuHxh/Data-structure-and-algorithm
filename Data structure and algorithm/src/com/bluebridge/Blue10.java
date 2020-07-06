package com.bluebridge;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/2/28 20:59
 */
public class Blue10 {
    public static void main(String[] args) {
        final Double PI=3.14159265358979323;
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.printf("%.7f",PI*r*r);
    }
}
