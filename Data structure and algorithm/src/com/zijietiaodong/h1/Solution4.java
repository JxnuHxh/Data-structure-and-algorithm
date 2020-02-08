package com.zijietiaodong.h1;

import com.hxh.DFS.TreeNode;

import java.util.Stack;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.zijietiaodong.h1
 * @date 2020/2/8 21:42
 */
public class Solution4 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if (t1 == null)
                return t2;
            Stack < TreeNode[] > stack = new Stack< >();
            stack.push(new TreeNode[] {t1, t2});
            while (!stack.isEmpty()) {
                TreeNode[] t = stack.pop();
                if (t[0] == null || t[1] == null) {
                    continue;
                }
                t[0].val += t[1].val;
                if (t[0].left == null) {
                    t[0].left = t[1].left;
                } else {
                    stack.push(new TreeNode[] {t[0].left, t[1].left});
                }
                if (t[0].right == null) {
                    t[0].right = t[1].right;
                } else {
                    stack.push(new TreeNode[] {t[0].right, t[1].right});
                }
            }
            return t1;
        }

}
