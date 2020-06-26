package com.排序算法;
//冒泡排序

public class BubbleSort {
    public  static String str="fafa";
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
}
