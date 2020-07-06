package com.剑指Offer;

import com.hxh.DFS.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/18 16:04
 */
public class Offer07 {
    int inIndex=0;
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,(long)Integer.MAX_VALUE+1);
    }
    public TreeNode helper(int[] preorder,int[] inorder,long stop){
        if(preIndex>=preorder.length){
            return null;
        }
        if(inorder[inIndex]==stop){
            inIndex++;
            return null;
        }
        int val=preorder[preIndex++];
        TreeNode root=new TreeNode(val);
        root.left=helper(preorder,inorder,val);
        root.right=helper(preorder,inorder,stop);
        return root;
    }
}
