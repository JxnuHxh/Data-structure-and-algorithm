package com.hxh.DG;



       // 1   找整个递归的终止条件：递归应该在什么时候结束？

       // 2     找返回值：应该给上一级返回什么信息？

       // 3   本级递归应该做什么：在这一级递归中，应该完成什么任务？


public class Recursion {
    /*

        public ListNode swapPairs(ListNode head) {
            //终止条件：链表只剩一个节点或者没节点了，没得交换了。返回的是已经处理好的链表
            if(head == null || head.next == null){
                return head;
            }
            //一共三个节点:head, next, swapPairs(next.next)
            //下面的任务便是交换这3个节点中的前两个节点
            ListNode next = head.next;
            head.next = swapPairs(next.next);
            next.next = head;
            //根据第二步：返回给上一级的是当前已经完成交换后，即处理好了的链表部分
            return next;
        }*/
}
