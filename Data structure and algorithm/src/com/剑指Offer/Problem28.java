package com.剑指Offer;

import com.hxh.DFS.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/19 15:05
 */
public class Problem28 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
return recur(root.left,root.right);
    }
    boolean recur(TreeNode l,TreeNode r){
        if(l==null&&r==null)return true;
        if(l==null||r==null)return false;
        return l.val==r.val&&recur(l.left,r.right)&&recur(l.right,r.left);
    }
}
