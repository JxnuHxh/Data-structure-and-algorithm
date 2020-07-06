package com.bytedance;

import com.hxh.DFS.TreeNode;

public class ByteDance03 {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
