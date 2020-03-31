package com.分类.数组和矩阵.LeetCode105还原二叉树;

import com.hxh.DFS.TreeNode;

import java.util.Arrays;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.数组和矩阵
 * @date 2020/3/31 20:08
 */
public class LeetCode105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     if(preorder.length==0)return null;
     TreeNode root=new TreeNode(preorder[0]);
     for(int i=0;i<inorder.length;i++) {
         if (preorder[0] == inorder[i]) {
             int[] pleft = Arrays.copyOfRange(preorder, 1, i+1);
             int[] pright = Arrays.copyOfRange(preorder, i + 1, preorder.length );
             int[] ileft = Arrays.copyOfRange(inorder, 0, i);
             int[] iright = Arrays.copyOfRange(inorder, i + 1, inorder.length );
             root.left = buildTree(pleft, ileft);
             root.right = buildTree(pright, iright);
             break;
         }
     }
        return root;
    }
}
