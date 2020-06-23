package com.排序算法;

public class BubbleSort {
    private static  int[] bubbleSort(int[] arrays){
        int len=arrays.length;
        if (len<2)return arrays;
        for(int i=0;i<len;i++){
            for(int j=0;j<arrays.length-1-i;j++){
                if(arrays[j]>arrays[j+1]){
                    int temp = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }

        return arrays;
    }

    public static void main(String[] args) {
       int[] a= BubbleSort.bubbleSort(new int[]{3,2,5,1,1,30,9,100,31,2});
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
