package com.lanqiaobei;

import java.util.*;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/3/2 1:38
 * 分考场
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int n=input.nextInt();
        List<Integer> res=new ArrayList<>();           //保存小数点后的数字
        List<Integer> list=new ArrayList<>();          //保存已计算过的余数
        int mod=a%b,index=0;                           //index记录出现循环节的位置
        while(mod!=0&&res.size()<n+2){
            int temp=mod*10/b;
            res.add(temp);
            mod=mod*10%b;
            int pos=list.indexOf(mod);
            if(pos!=-1){
                index=pos;                                //出现曾经计算过的余数 说明为无限循环小数(即循环节开始)
                break;
            }
            list.add(mod);                               //存储余数
        }
        if(mod==0||res.size()>=n+2){
            for(int i=0;i<3;i++){
                if(n+i<=res.size())
                    System.out.print(res.get(n+i-1));
                else
                    System.out.print(0);
            }
        }
        else{
            int len=list.size()-index;                   //计算循环节的长度
            for(int i=0;i<3;i++){
                if(n+i<=res.size())
                    System.out.print(res.get(n+i-1));
                else
                    System.out.print(res.get((n+i-1-index)%len+index));   //根据循环节的长度和起始位置计算
            }
        }
    }
}
