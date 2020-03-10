package com.剑指Offer;

import com.hxh.DG.ListNode;
import com.hxh.stack.Stack;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/10 20:56
 */
public class Pro6 {
    public int[] reversePrint(ListNode head){
        Stack stack=new Stack();
        int f=0;
        while (head!=null){
            stack.push(head.val);
            head=head.next;
            f++;
        }
        int[] arr=new int[f];
        for (int i=0;i<f;i++)
            arr[i]=stack.pop();
        return arr;
    }
}
