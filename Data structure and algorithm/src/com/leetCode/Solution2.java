package com.leetCode;

import com.hxh.DFS.TreeNode;

/**
 * @author atom.hu
 * @version 相同的树
 * @Package com.leetCode
 * @date 2020/1/12 14:53
 */
public class Solution2 {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;
            if (q == null || p == null) return false;
            if (p.val != q.val) return false;
            return isSameTree(p.right, q.right) &&
                    isSameTree(p.left, q.left);

        }
}
