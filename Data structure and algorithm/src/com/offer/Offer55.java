package com.offer;

import com.hxh.DFS.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Offer55 {
    public int TreeDepth(TreeNode pRoot) {
        if (pRoot == null) {
            return 0;

        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int depth = 0, count = 0, nextCount = 1;
        while (queue.size() != 0) {
            TreeNode top = queue.poll();
            count++;
            if (top.left != null) {
                queue.add(top.left);
            }
            if (top.right != null) {
                queue.add(top.right);
            }
            if (count == nextCount) {
                nextCount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }
}



