package com.剑指Offer;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/14 19:57
 */
public class Offer12 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board,words,i,j,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, char[] words, int i, int j, int k){
        if (i<0||i>=board.length||j<0||j>=board[0].length||words[k]!=board[i][j]) return false;
        if (k==words.length-1) return true;
        char tmp = board[i][j];
        board[i][j] = '/';
        boolean res = dfs(board,words,i+1,j,k+1) || dfs(board,words,i,j+1,k+1) || dfs(board,words,i-1,j,k+1) || dfs(board,words,i,j-1,k+1);
        board[i][j] = tmp;
        return res;
    }
}
