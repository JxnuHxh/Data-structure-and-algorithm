package com.面试笔试;

import com.entity.ListNode;
//链表排序
public class SortListNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(9);
        ListNode p = new  ListNode(3);
       head.next=p;
        p.next=null;
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static ListNode sortList(ListNode head){
        return head == null ? head:mergeSort(head);
    }
    public static ListNode mergeSort(ListNode head){
        if(head.next==null){
            return head;
        }
        ListNode s = head ;
        ListNode f = head;
        ListNode sign = null;
        while (f.next !=null){
            sign = s;
            s= s.next;
            f= f.next.next;
        }
        sign.next = null ;
        ListNode left = mergeSort(head);

        ListNode right = mergeSort(s);
        return merge(left,right);
    }
    public static  ListNode merge(ListNode l,ListNode r){
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while(l != null && r!= null){
            if(l.val <= r.val){
                cur.next = l;
                cur = cur.next;
                l=l.next;
            }else{
                cur.next = r;
                cur = cur.next;
                l = l.next;
            }
        }
        if(l != null){
            cur.next = l;
        }
        if(r != null){
            cur.next = r;
        }
        return dummyHead.next;
    }
}
