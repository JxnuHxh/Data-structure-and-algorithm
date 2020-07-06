package com.hxh.DG;

import com.hxh.DFS.TreeNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.leetCode
 * @date 2020/1/11 18:45
 */
public class Solution {
    private ListNode findMiddleElement(ListNode head){
        ListNode prevPtr=null;
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while(fastPtr!=null&&fastPtr.next!=null){
            prevPtr=slowPtr;
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        if(prevPtr!=null){
            prevPtr.next=null;
        }
        return slowPtr;
    }
    public TreeNode sortedListToBoBST(ListNode head){
        if(head==null){
            return null;
        }
        ListNode mid = this.findMiddleElement(head);
        TreeNode node = new  TreeNode(mid.val);
        if(head == mid ){
            return node ;
        }
        node.left=this.sortedListToBoBST(head);
        node.right=this.sortedListToBoBST(mid.next);
        return node;

    }

}
