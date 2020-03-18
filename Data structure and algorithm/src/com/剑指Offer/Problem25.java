package com.剑指Offer;

import com.hxh.DG.ListNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/18 21:19
 */
public class Problem25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1), pre = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                pre = pre.next;
                l1 = l1.next;
            } else {
                pre.next = l2;
                pre = pre.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            pre.next = l1;
        }
        if (l2 != null) {
            pre.next = l2;
        }

        return dummyHead.next;
    }
}
