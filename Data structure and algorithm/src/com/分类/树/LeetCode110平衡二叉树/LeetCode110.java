package com.分类.树.LeetCode110平衡二叉树;

import com.entity.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.树.LeetCode110平衡二叉树
 * @date 2020/4/1 15:15
 */
public class LeetCode110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

}
