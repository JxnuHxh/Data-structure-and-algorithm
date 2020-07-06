package com.剑指Offer;

import com.hxh.DG.ListNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/20 11:15
 */
public class Offer24 {
    public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        ListNode p,q;
        p=head.next;
        head.next=null;
        while(p!=null){
            q=p;
            p=p.next;
            q.next=head;
            head=q;

        }
        return head;
    }
}
