package com.剑指Offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author atom.hu
 * @version V1.0
 * @Package com.剑指Offer
 * @date 2020/3/20 17:24
 */
public class Offer34 {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        Node p=head;
        while(p!=null){
            map.put(p,new Node(p.val));
            p=p.next;
        }
        p=head;
        while(p!=null){
            map.get(p).next=map.get(p.next);
            map.get(p).random=map.get(p.random);
            p=p.next;
        }
        return map.get(head);
    }
}
