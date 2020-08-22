package com.leetcode;

import com.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode111 {
    public int minDepth(TreeNode root) {
       if (root==null)return 0;
       Queue<TreeNode> queue=new LinkedList<>();
       int l=0;
       queue.offer(root);
       while(!queue.isEmpty()){
           int size=queue.size();
           l++;
           for (int i=0;i<size;i++){
               TreeNode p=queue.poll();
               if(p.left==null&&p.right==null)return l;
               if(p.left!=null)queue.offer(p.left);
               if (p.right!=null)queue.offer(p.right);
           }
       }
       return l;
    }
}
