package com.leetcode;

import com.entity.ListNode;
//相交链表
//两个链表走完自己的都去走对方的链表，如果有相交，就会在后边相遇
public class Leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
