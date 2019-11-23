package com.cowguest.n001;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

 class Main implements Comparator<Main.pro> {

    @Override
    public int compare(Main.pro o1,Main.pro o2){
        if(o1.a*o2.b<o1.b*o2.a)return -1;
        if(o1.a*o2.b>o1.b*o2.a)return 1;
        return 0;
    }
    public static  class pro{
        public int a;
        public int b;
        public pro(int a,int b){
            this.a=a;
            this.b=b;
        }
        }

    public static void main(String[] args) {
        long sum=0;
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        pro[] pros=new pro[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            pros[i]=(new pro(a,b));
            sum+=b;
        }
        Arrays.sort(pros,new Main());
        long res=0;
        for(int i=0;i<n;i++){
            sum-=pros[i].b;
            res+=(pros[i].a*sum);
        }
        System.out.println(res);
}
}
