package com.leetCode;

import com.hxh.DFS.TreeNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author atom.hu
 * @version 二叉树层次遍历
 * @Package com.leetCode
 * @date 2020/1/12 12:13
 */
public class Solution1 {
    List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        funtion(root,0);
        return lists;
    }
    private void funtion(TreeNode root,Integer dep){
        if(root==null)
            return ;
        if(lists.size()==dep){
           List<Integer> temp=new ArrayList<>();
            temp.add(root.val);
            lists.add(temp);
        }else{
            lists.get(dep).add(root.val);
        }
        funtion(root.left,dep+1);
        funtion(root.right,dep+1);

    }
}
