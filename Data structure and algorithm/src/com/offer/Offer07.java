package com.offer;


import com.entity.TreeNode;

import java.util.Arrays;

public class Offer07 {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in){
        if(pre.length==0|| in.length==0){
            return null;
        }
        TreeNode root =new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(in[i]==pre[0]){
                root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in, 0, i));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
                 break;
            }
        }
        return root;
    }
}
