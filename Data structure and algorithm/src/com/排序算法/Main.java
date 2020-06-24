package com.排序算法;

public class Main {
    public static void main(String[] args) {
        int[] a= QuickSort.quickSort(new int[]{3,2,5,11,30,9,100,31,2});
        if(a==null) return;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
