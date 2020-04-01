package com.分类.树.LeetCode110平衡二叉树;

import com.hxh.DFS.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.分类.树.LeetCode110平衡二叉树
 * @date 2020/4/1 15:51
 */
public class Leetcode0110 {
    //递归返回值：
    //当节点root 左 / 右子树的高度差 < 2<2 ：则返回以节点root为根节点的子树的最大高度，即节点 root 的左右子树中最大高度加 11 （ max(left, right) + 1 ）；
    //当节点root 左 / 右子树的高度差 \geq 2≥2 ：则返回 -1−1 ，代表 此子树不是平衡树 。
    //递归终止条件：
    //当越过叶子节点时，返回高度 00 ；
    //当左（右）子树高度 left== -1 时，代表此子树的 左（右）子树 不是平衡树，因此直接返回 -1−1 ；
    //isBalanced(root) ：
    //
    //返回值： 若 recur(root) != 1 ，则说明此树平衡，返回 truetrue ； 否则返回 falsefalse 。
    //
    //作者：jyd
    //链接：https://leetcode-cn.com/problems/balanced-binary-tree/solution/balanced-binary-tree-di-gui-fang-fa-by-jin40789108/
    //来源：力扣（LeetCode）
    //著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
