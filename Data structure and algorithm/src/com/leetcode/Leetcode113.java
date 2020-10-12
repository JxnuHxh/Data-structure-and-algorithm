package com.leetcode;

import com.entity.TreeNode;
import java.util.ArrayList;
import java.util.List;

//路径总和2
public class Leetcode113 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return res;
        pathSum(root, sum, new ArrayList<Integer>());
        return res;
    }
    public void pathSum(TreeNode root, int sum, List<Integer> path) {
        path.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(path);
            return ;
        }
        if (root.left != null)
            pathSum(root.left, sum-root.val, new ArrayList<Integer>(path));
        //这里关键 一定要new，不然永远是同一个
        if (root.right != null)
            pathSum(root.right, sum-root.val, new ArrayList<Integer>(path));
    }
}
