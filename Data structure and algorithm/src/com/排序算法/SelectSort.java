package com.排序算法;
//选择排序
public class SelectSort {
   public  static  int[] selectSort(int[] array){
        int len=array.length;
        if(len<2)return array;

        for(int i=0;i<len;i++){
            int minindex=i;
            for(int j=i;j<len;j++){//这里j要从i开始
                if(array[j]<array[minindex]){//找到最小的数
                    minindex=j;//将最小数的索引保存
                }
            }
            int temp = array[minindex];
            array[minindex] = array[i];
            array[i] = temp;

        }
        return array;
    }
}
