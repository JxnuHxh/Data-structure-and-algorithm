package com.lanqiaobei;

import java.util.*;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.lanqiaobei
 * @date 2020/3/2 1:38
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a,b=0;
        Set<Integer> set=new HashSet<>();
        Map<Integer,Set> map=new HashMap<>();
        List list=new ArrayList();
        while (m!=0){
            a=sc.nextInt();
            b=sc.nextInt();
            if (map.containsKey(a)){
                set.add(b);
                map.put(a,set);
            }else{
                map.put(a,)
            }
            m--;

        }
    }
}
