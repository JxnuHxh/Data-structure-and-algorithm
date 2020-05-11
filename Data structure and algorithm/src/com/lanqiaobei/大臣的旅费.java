package com.lanqiaobei;
import java.util.Arrays;
import java.util.Scanner;
/*
 * 假设 s-t这条路径为树的直径，或者称为树上的最长路
 * 现有结论，从任意一点u出发搜到的最远的点一定是s、t中的一点，然后在从这个最远点开始搜，就可以搜到另一个最长路的端点，
 * 即用两遍广搜就可以找出树的最长路
 */
public class 大臣的旅费 {//单纯的用二维数组会超时，为什么用动态数组就不会内存了呢

    public static int[][] Map = new int[7010][7010];
    public static int[] vis = new int[7010];
    public static int ans = -99999,temp,n;

    static void dfs(int s,int dist){//深度优先搜索
        //总的花费
        if(dist > ans ){  //保存最长路以及最长路端点
            ans = dist;
            temp = s;//这里非常的关键，要进行最远路的点的更换
        }
        for(int i=1;i<=n;i++){

            if(vis[i]==0 && Map[s][i]>0){
                //如果没有被访问过  而且  s与i间的路程有效
                vis[i] = 1;//被置为访问过
                dist += Map[s][i];//累加路程
                dfs(i,dist);//i 变   s 再进行下一
                vis[i] = 0;
                dist -= Map[s][i];
            }
        }

        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            Map[a][b] = Map[b][a] = c;
        }
        vis[1] = 1;//这个初始化非常的关键，你从第一个点开始搜，第一个点当然遍历到了
        dfs(1,0);//搜索最长路起始点
        Arrays.fill(vis, 0);//什么要还原一定要想明白，不要有遗漏知道吗

        vis[temp] = 1;//从最远端再搜到另一个最远端
        ans = -99999; //搜到的就是最长路
        dfs(temp,0);
        int sum = (11+10+ans)*ans/2;//x+10的线性费用//他妈的最后一步就忘了？傻逼，为了成功，必须要克服这些弱点，否则你的优点就会被埋没
        System.out.println(sum);
    }
}