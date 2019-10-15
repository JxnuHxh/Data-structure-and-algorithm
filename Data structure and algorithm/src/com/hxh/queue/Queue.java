package com.hxh.queue;

import com.hxh.stack.Stack;

public class Queue {
    private static class Node{
        private int val ;
        private Stack.Node next;
        private Node(int x){
            this.val=x;
        }
    }
    private Node head;
    private Node tail;
    public boolean isEmpty(){
        return head=null;

    }
    public  int peek(){
        return head.val;
    }
    public void add (int val )
    {
        Node node =new Node(val);
        if(tail !=null){
            tail.next=null;

        }tail= node ;
        if(head==null)
        {
            head = node;
        }

    }
    public int remove(){
        int value = head.val;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        return value;
    }
}
