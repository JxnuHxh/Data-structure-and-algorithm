package com.hxh.DFS;

import com.entity.TreeNode;

public class Dfs {
//将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树
        public TreeNode sortedArrayToBST(int[] nums) {
            return nums == null ? null : buildTree(nums, 0, nums.length - 1);
        }
        private TreeNode buildTree(int[] nums,int l,int r){
            if(l > r){
                return null;
            }
            int m = l + (r - l) / 2;
            TreeNode root=new TreeNode(nums[m]);
            root.left=buildTree(nums, l,m - 1);
            root.right=buildTree(nums, m + 1, r);
            return root;
    }
}
