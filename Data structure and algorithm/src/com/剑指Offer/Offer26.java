package com.剑指Offer;

import com.entity.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/18 23:25
 */
public class Offer26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null)return false;
        return recursion(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
        // 若树 B 是树 A 的子结构，则必满足以下三种情况之一，因此用或 || 连接；
        //以 节点 A 为根节点的子树 包含树 B ，对应 recur(A, B)；
        //树 B 是树 A 左子树 的子结构，对应 isSubStructure(A.left, B)；
        //树 B 是树 A 右子树 的子结构，对应 isSubStructure(A.right, B)；
    }
    boolean  recursion(TreeNode A,TreeNode B){
        if(B==null)return true;
        if(A==null)return false;
        return A.val!=B.val && recursion(A.left,B.left) && recursion(A.right,B.right);
 }

}
