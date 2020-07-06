package com.leetcode;

import com.entity.ListNode;
import com.entity.TreeNode;

/**
 * @author atom.hu
 * @version 有序链表转二叉搜索树
 * @Package com.leetCode
 * @date 2020/1/11 18:45
 */
public class Leetcode109 {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        else if(head.next == null) return new TreeNode(head.val);
        ListNode pre = head;
        ListNode p = pre.next;
        ListNode q = p.next;
        //找到链表的中点p
        while(q!=null && q.next!=null){
            pre = pre.next;
            p = pre.next;
            q = q.next.next;
        }
        //将中点左边的链表分开
        pre.next = null;
        TreeNode root = new TreeNode(p.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(p.next);
        return root;
    }
}
