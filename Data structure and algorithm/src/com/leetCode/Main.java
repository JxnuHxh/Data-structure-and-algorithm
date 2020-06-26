package com.leetCode;

import com.排序算法.BubbleSort;

public class Main {
    public static void main(String[] args) {
     Thread t1= new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        },"线程1");
      String str=  BubbleSort.str;
        System.out.println(str);
    }
}
