package com.分类.树.Leetcode98验证二叉搜索树;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.树.Leetcode98验证二叉搜索树
 * @date 2020/3/31 0:47
 */
public class Leetcode98 {
    private long prev = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        return (root == null) || (isValidBST(root.left) && prev < (prev = root.val) && isValidBST(root.right));
    }
}
