package com.leetcode;


import com.entity.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.leetCode
 * @date 2020/1/12 19:46
 */
public class Leetcode101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmertric(root.left, root.right);
    }
    private boolean isSymmertric(TreeNode t1,TreeNode t2) {
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        if(t1.val != t2.val) return false;
        return isSymmertric(t1.left, t2.right) && isSymmertric(t1.right, t2.left);
    }
}
