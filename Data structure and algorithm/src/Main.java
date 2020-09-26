import java.util.List;
class  Node{

    int val;Node next;
    public Node(int val){
        this.val=val;
    }
}
public class Main {
    public static void main(String[] args) {

    }

   static Node merge(List<Node> list){
        if(list == null )return null;
        if(list.size()== 1)return list.get(0);
        int i = 0;
        Node l1 = list.get(0);
        list.remove(l1);
        Node l2 = list.get(0);
        list.remove(l2);
        while(list.size() > 0){
            l1 = function(l1,l2);
            l2 = list.get(0);
            list.remove(l2);
        }
        l1 = function(l1,l2);
        return l1;
    }
   public static Node  function(Node l1,Node l2){
        Node head = new Node(0);
        Node pre = head;
        while(l1!=null||l2!=null){
            if(l1.val < l2.val){
                pre.next = l1;
                l1 = l1.next;
            }else{
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        return head.next;
    }
}

