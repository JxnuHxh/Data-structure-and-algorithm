package com.分类.树.Leetcode437路径总和3;

import com.hxh.DFS.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.树.Leetcode437路径总和3
 * @date 2020/4/3 20:46
 */
public class Leetcode437 {
    private int sum;
    public int pathSum(TreeNode root, int sum) {
        this.sum = sum;
        return getSum(root, new int[1000], 0);
    }
    private int getSum(TreeNode root, int[] vals, int layer) {
        if(root == null)    return 0;
        vals[layer] = root.val;
        int cur = 0;
        int temp = 0;
        for(int i = layer; i >= 0; i--)
        {
            temp += vals[i];
            if(temp == this.sum)    cur++;
        }
        return cur + getSum(root.left, vals, layer + 1) + getSum(root.right, vals, layer + 1);
    }
}
