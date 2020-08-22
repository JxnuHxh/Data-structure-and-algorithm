package com.排序算法;

public class QuickSort {
    public static int[] quickSort(int[] array) {
        int len;
        if (array == null || (len = array.length) <= 1)
            return array;
        sort(array, 0, len - 1);
        return array;
    }
    public static void sort(int[] array, int left, int right) {
        if(left>right){
            return ;
        }
        // base中存放基准数
        int base = array[left];
        int i = left, j = right;
        while (i != j) {
            // 顺序很重要，先从右边开始往左找，直到找到比base值小的数
            while (array[j] >= base && i < j) {
                j--;
            }
            // 再从左往右边找，直到找到比base值大的数
            while (array[i] <= base && i < j) {
                i++;
            }
            // 上面的循环结束表示找到了位置或者(i>=j)了，交换两个数在数组中的位置
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        // 将基准数放到中间的位置（基准数归位）
        array[left] = array[i];
        array[i] = base;
        // 递归，继续向基准的左右两边执行和上面同样的操作
        // i的索引处为上面已确定好的基准值的位置，无需再处理
        sort(array, left, i - 1);
        sort(array, i + 1, right);
    }

    //单边实现法
    public static void quickSort(int[] arr,int startIndex,int endIndex){
        //递归条件结束，startIndex和endIndex相遇
        if (startIndex>=endIndex){
            return;
        }
        //得到基准元素的位置
        int pivorIndex=partition(arr,startIndex,endIndex);
        //根据基准元素，分为两部分进行递归
        quickSort(arr,startIndex,pivorIndex-1);
        quickSort(arr,pivorIndex+1,endIndex);
    }
    private static int partition(int[] arr,int startIndex,int endIndex){
        //取第一个位置的元素作为基准
        int pivot=arr[startIndex];
        int mark=startIndex;
        for (int i = startIndex; i <=endIndex ; i++) {
            if (arr[i]<pivot){
                mark++;
                int p=arr[mark];
                arr[mark]=arr[i];
                arr[i]=p;
            }
        }
        arr[startIndex]=arr[mark];
        arr[mark]=pivot;
        return mark;
    }
}
