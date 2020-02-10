package com.zijietiaodong.h1;

import com.hxh.DFS.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.zijietiaodong.h1
 * @date 2020/2/10 22:57
 * 根据中序 后序遍历还原二叉树
 */
public class Solution6 {
    int inIndex;
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inIndex=inorder.length-1;
        postIndex=postorder.length-1;
        return helper(inorder,postorder,(long)Integer.MAX_VALUE+1);
    }
    public TreeNode helper(int[] inorder, int[] postorder, long stop){
        if(postIndex<0){
            return null;
        }
        if(inorder[inIndex]==stop){
            inIndex--;
            return null;
        }
        int val=postorder[postIndex--];
        TreeNode root=new TreeNode(val);
        root.right=helper(inorder,postorder,val);
        root.left=helper(inorder,postorder,stop);
        return root;
    }


}
