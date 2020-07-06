package com.hxh.DG;

import com.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;


//返回树的中序遍历
public class LL {

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList();
        }
        List<Integer> resultList=new ArrayList<>();
        resultList.addAll(preorderTraversal(root.left));
        resultList.add(root.val);
        resultList.addAll(preorderTraversal(root.right));
        return resultList;
    }

}
