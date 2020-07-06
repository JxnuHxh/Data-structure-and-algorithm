package com.剑指Offer;

import com.hxh.DG.ListNode;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/19 22:58
 */
public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int length = 0;
        ListNode current = head;
        while(current!=null) {
            length++;
            current = current.next;
        }
        length = length-k;
        for(int i = 0;i<length;i++) {
            head = head.next;
        }
        return head;
    }
}
