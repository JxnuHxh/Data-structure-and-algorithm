package com.entity;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/20 17:25
 */
public class Node {
       public int val;
    public Node next;
    public Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }

}
