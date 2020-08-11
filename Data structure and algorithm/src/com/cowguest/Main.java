package com.cowguest;

public class Main {
    public static void main(String[] args) {
        CowGuest08 cowGuest08=new CowGuest08();
        int p=0;
        int[][] a=new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++)
                a[i][j]=p++;
        }
       System.out.println(cowGuest08.selectPresent(a));
    }
}
