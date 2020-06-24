package com.排序算法;

public class InsertionSort {
    public static int[] InsertionSort(int[] array){
        int len=array.length;
        if(len<2)return array;
        for(int i=0;i<len-1;i++){
            int c=array[i+1];
            int p=i;
            while(p>=0&&array[p]>c){
                array[p+1]=array[p];
                 p--;
            }
            array[p+1]=c;
        }
        return array;
    }
}
