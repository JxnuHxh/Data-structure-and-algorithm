package com.剑指Offer;
import com.hxh.DFS.TreeNode;
/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/19 11:20
 */
public class Offer27 {
    public TreeNode mirrorTree(TreeNode root){
        if(root==null)return null;
        TreeNode tempTree=root.left;
        root.left=mirrorTree(root.left);
        root.right=mirrorTree(tempTree);
        return root;
    }
}
