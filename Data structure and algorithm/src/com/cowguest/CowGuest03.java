package com.cowguest;

import java.util.Arrays;
import java.util.Scanner;

public class CowGuest03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i < m ; i++){
            arr[scanner.nextInt()-1]++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
