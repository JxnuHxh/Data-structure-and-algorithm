package com.leetcode;

import com.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode637 {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Double> list = new ArrayList<>();
        queue.add(root);

        while (list.size()>0){
            int len = list.size();
            double sum = 0;
            for(int i=0;i<len;i++){
                TreeNode node = queue.poll();
                sum = sum +node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            list.add(sum/len);
        }
        return  list;
    }
}
