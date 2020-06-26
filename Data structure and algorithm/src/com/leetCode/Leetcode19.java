package com.leetCode;

import com.hxh.DG.ListNode;

public class Leetcode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)return null;
        ListNode p=head,q=head;
        int count=0,len=0;
        while(q!=null&&q.next!=null){
            count++;
            p=p.next;
            q=q.next.next;
        }
        if(q.next==null){
            len=(count<<1);
        }else{
            len=(count<<1)+1;
        }

        int index=len-n;
        q=p;
        p=p.next;
        if(index<=count)
        {
            q=head;
            p=head.next;
            count=0;

        }
        while(count!=index){

            q=q.next;
            p=p.next;
            count++;
        }
        q.next=p.next;
        return head;
    }
}
