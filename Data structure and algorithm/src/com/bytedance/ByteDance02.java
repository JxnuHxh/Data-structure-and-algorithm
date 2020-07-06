package com.bytedance;

//合并二叉树
public class ByteDance02 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null)
            return t2;
        if(t2==null)
            return  t1;
        t1.val+=t2.val;
        t1.right=mergeTrees(t1.right,t2.right);
        t1.left=mergeTrees(t1.left,t2.left);
        return t1;
    }
}
