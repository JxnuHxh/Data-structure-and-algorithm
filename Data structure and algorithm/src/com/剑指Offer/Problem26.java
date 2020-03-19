package com.剑指Offer;

import com.hxh.DFS.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/18 23:25
 */
public class Problem26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {\
        if(A==null||B==null)return false;
        return recursion(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }
    boolean  recursion(TreeNode A,TreeNode B){
        if(B==null)return true;
        if(A==null)return false;
        return A.val!=B.val && recursion(A.left,B.left) && recursion(A.right,B.right);
 }
}
