package com.lanqiaobei;


import java.util.*;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/4/11 19:41
 */
public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int[] a=new int[n-1];
        int sum=0;
        List<Integer> list=new ArrayList<Integer>();
        while (n>0){
            n--;
           list.add(sc.nextInt());
        }
        for(int i=0;i<m-1;i++) {
            Collections.sort(list);
            a[i] = list.get(0) + list.get(1);
            list.set(0,a[i]);
            list.remove(1);
        }
        for(int j=0;j<m-1;j++){
            sum+=a[j];
        }
        System.out.print(sum);
    }
}

