package com.面试笔试;

public class Pacg01 {
    public static void main(String[] args) {

    System.out.println(Pacg01.bag3(10,new int[]{5,3,6,2,4},new int[] {5,2,3,4,5}, new int[] {1,3,1,2,3}));

    }
    //01背包
    public static int bag( int  w,int[] weight,int[] value ) {
        int N = weight.length-1;
        int[] f= new int[w+1];
        for(int i=1;i<=N;i++){
            for(int j=w;j>=weight[i];j--)
                f[j]=Math.max(f[j],f[j-weight[i]]+value[i]);
        }
        return f[w];
    }
    //完全背包
    public  static int bag2(int w,int[] weight,int[] value){
        int N = weight.length - 1;
        int[] f = new int[w  + 1];
        for(int i = 1; i  <= N; i++){
            for(int j = weight[i]; j <= w; j++){
                f[j] = Math.max(f[j], f[j - weight[i]] + value[i]);
            }
        }
        return f[w];
    }
    //多重背包
    public static  int bag3(int w, int[] weight, int[] value, int[] nums){
        int[] f = new int[w  + 1];
        int N = weight.length - 1;
        for(int i = 1; i <= N; i++){
            for (int k = 1; k <= nums[i]; k++){
                for (int j = w; j >=  weight[i]; j--){
                    if(j >= k*weight[i]) {
                        f[j] = Math.max(f[j], f[j - (k * weight[i])] + k * value[i]);
                    }
                }

            }
        }
        return f[w];
    }
}
