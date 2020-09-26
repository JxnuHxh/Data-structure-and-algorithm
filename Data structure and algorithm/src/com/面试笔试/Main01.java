package com.面试笔试;
//求 1 - n n个节点能组成多少种二叉查找树
public class Main01 {
    public static void main(String[] args) {
       System.out.println(Main01.numTrees(15));
    }
    public static  int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;       //没有节点则为0，空树只有1个
        G[1] = 1;       //有1个节点，树只有1个

        for (int i = 2; i <= n; ++i) {        //要想得到以1-n的总二叉搜索树的总数量则需要把之前的也计算出来
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}
