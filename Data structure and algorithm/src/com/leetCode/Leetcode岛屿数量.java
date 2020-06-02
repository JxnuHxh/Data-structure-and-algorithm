package com.leetCode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.leetCode
 * @date 2020/6/1 22:20
 */
public class Leetcode岛屿数量 {
    public int numIslands(char[][] grid,int p,StringBuffer s) {
        s.append("fjlasfl");
        System.out.println("s="+s);
        p++;
        System.out.println("p="+p);
        int isLandNum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    infect(grid,i,j);
                    isLandNum++;
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]);
            }
        }
        return isLandNum;

    }
    private void infect(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!='1'){
            return;
        }
        grid[i][j]='2';
        infect(grid,i+1,j);
        infect(grid,i-1,j);
        infect(grid,i,j+1);
        infect(grid,i,j-1);
    }

    public static void main(String[] args) {
        Leetcode岛屿数量 l=new Leetcode岛屿数量();
        char[][] chars=new char[4][4];
        StringBuffer s=new StringBuffer("fjsl");
        int p=0;
        for(int i=0;i<chars.length;i++){
            for(int j=0;j<chars[0].length;j++){
                chars[i][j]='1';
            }
        }
        System.out.println(l.numIslands(chars,p,s));
        System.out.println(chars[1][1]);
        System.out.println("p="+p);
        System.out.println("s="+s);
    }
}
