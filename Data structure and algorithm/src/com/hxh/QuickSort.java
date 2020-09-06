package com.hxh;

import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] array, int start, int end) {

        if (start >= end)
            return array;

        int partition = partition1(array, start, end);
        quickSort(array, start, partition - 1);
        quickSort(array, partition + 1, end);
        return array;
    }

    private static int partition2(int[] array, int start, int end) {

        int pivot = array[start];
        int left = start;
        int right = end;
        while (left != right) {

            while (left < right && array[right] > pivot) {
                right--;
            }
            while (left < right && array[left] <= pivot) {
                left++;
            }

            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        array[start] = array[left];
        array[left] = pivot;
        return left;
    }

    //单边循环
    private static int partition1(int[] array, int start, int end) {

        int pivot = array[start];
        int mask = start;

        for (int i = start+1; i < array.length; i++) {
            if (array[i]<pivot){
                mask++;
                int temp = array[mask];
                array[mask] = array[i];
                array[i] = temp;
            }
        }

        array[start]=array[mask];
        array[mask] = pivot;

        return mask;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0,4,43,23,0,342};

        System.out.println(Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
