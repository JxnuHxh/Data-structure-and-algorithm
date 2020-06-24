package com.排序算法;

public class Main {
    public static void main(String[] args) {
        int[] a= InsertionSort.InsertionSort(new int[]{3,2,5,1,1,30,9,100,31,2});
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
