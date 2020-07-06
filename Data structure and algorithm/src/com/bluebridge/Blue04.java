package com.bluebridge;

import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com
 * @date 2020/5/23 14:36
 */
public class Blue04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int L=sc.nextInt();
        int R=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        int[][] c=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]=a[i]*b[j];
            }
        }
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum=0;
                for(int x=j;x<m;x++){
                    sum+= c[i][x];
                    if(sum>=L&&sum<=R)
                        count++;
                    int q=sum;
                    while(sum<R){
                        sum=sum+sum*b[j];
                        if(sum>=L&&sum<=R)
                            count++;
                    }
                    sum=q;

                }
                sum=c[i][j];
                for(int y=i+1;y<m;y++){
                    sum+= c[y][j];
                    if(sum>=L&&sum<=R)
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
