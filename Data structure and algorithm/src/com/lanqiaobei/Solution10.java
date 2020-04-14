package com.lanqiaobei;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/4/14 22:39
 */
import java.util.Scanner;

public class Solution10 {
    static int[][] input;
    static boolean maodun = false;
    static int[] judge;// 判断数组
    static int n;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        input = new int[n + 1][n + 1]; // 初始化
        judge = new int[n + 1];
        for (int i = 1; i < n + 1; i++) // -1表示未使用，1表示good，2表示bad
            judge[i] = -1;

        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                input[i][j] = s.nextInt();


        int index=1;
        for (int i = 1; i <= n; i++) {
            put(i, 1);
            if(!maodun&&judge())//如果没有矛盾并且满足半数条件
            {
                index=i;    //第i个芯片是正确的
                break;
            }
        }

        for (int i = 1; i < n + 1; i++)
            if(input[index][i]==1)
                System.out.print(i+" ");

    }

    private static boolean judge() {// 判断1的个数是否超过半数

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (judge[i] == 1)
                count++;
        }
        if (count > n / 2)
            return true;


        for (int i = 1; i < n + 1; i++) // 再次初始化judge -1表示未使用，1表示good，2表示bad
            judge[i] = -1;

        return false;

    }

    private static void put(int i, int j) {
        maodun = false;// 防止递归操作受上一次影响

        if (judge[i] != j && judge[i] != -1)// 如果产生了矛盾
        {
            maodun = true;
            return;
        }

        if (judge[i] == j)// 如果已经放置
            return;

        judge[i] = j; // 放置

        for (int k = 1; k < input[0].length; k++) {
            if (input[i][k] == 1)
                put(k, input[i][k]);
        }

    }
}
