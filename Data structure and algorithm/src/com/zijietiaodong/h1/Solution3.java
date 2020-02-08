package com.zijietiaodong.h1;

import com.hxh.DFS.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.zijietiaodong.h1
 * @date 2020/2/7 19:36
 */
public class Solution3 {
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
