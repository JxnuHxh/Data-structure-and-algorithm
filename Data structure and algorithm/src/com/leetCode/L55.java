package com.leetCode;

import com.hxh.DFS.TreeNode;

public class L55 {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        return isBalanced(root.left) && isBalanced(root.right) &&Math.abs(dfs(root.left)-dfs(root.right))<2;
    }
    private static int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(dfs(root.left),dfs(root.right))+1;
    }
}
