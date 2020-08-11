package com.leetcode;

public class Leetcode130 {
    public void solve(char[][] board) {

        if(board == null ||board.length<1)
            return ;
        int rows=board.length-1,clums=board[0].length-1;
        for(int i =0;i<=rows;i++){
            if(board[i][0]=='O')dfs(i,0,board);
            if(board[i][clums]=='O')dfs(i,clums,board);
        }
        for(int i =1;i<clums;i++){
            if(board[0][i]=='O')dfs(0,i,board);
            if(board[rows][i]=='O')dfs(rows,i,board);
        }
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=clums;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='A')
                    board[i][j]='O';
            }
        }

    }
    private void dfs(int i,int j,char[][] board){
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!='O')return;
        board[i][j]='A';
        dfs(i-1,j,board);
        dfs(i+1,j,board);
        dfs(i,j-1,board);
        dfs(i,j+1,board);
    }
 }
