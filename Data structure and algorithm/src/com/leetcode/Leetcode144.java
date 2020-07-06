package com.leetcode;

import com.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;


//二叉树的前序遍历
public class Leetcode144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList();
        }
        List<Integer> resultList=new ArrayList<>();
        resultList.add(root.val);
        resultList.addAll(preorderTraversal(root.left));
        resultList.addAll(preorderTraversal(root.right));
        return resultList;
    }

}
