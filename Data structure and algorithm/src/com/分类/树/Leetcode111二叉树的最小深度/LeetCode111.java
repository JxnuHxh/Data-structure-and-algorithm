package com.分类.树.Leetcode111二叉树的最小深度;

import com.entity.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.树.Leetcode111二叉树的最小深度
 * @date 2020/4/1 16:28
 */
public class LeetCode111 {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int m1 = minDepth(root.left);
        int m2 = minDepth(root.right);
        //1.如果左孩子和右孩子有为空的情况，直接返回m1+m2+1
        //2.如果都不为空，返回较小深度+1
        return (root.left == null || root.right == null) ? m1 + m2 + 1 : Math.min(m1,m2) + 1;

    }
}
