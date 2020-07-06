package com.hxh.DG;


import com.hxh.DFS.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.leetCode
 * @date 2020/1/12 19:46
 */
public class Soluton3 {
    public boolean isDui(TreeNode root){
       return  ifN(root,root);
    }
    private boolean ifN(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null) return true;
        if(t1==null || t2==null) return false;
        return (t1.val==t2.val)&&ifN(t1.left,t1.right)&&ifN(t2.left,t2.right);
    }


    

}
