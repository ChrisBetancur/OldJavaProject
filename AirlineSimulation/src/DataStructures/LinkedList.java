package DataStructures;//import java.lang.String;

class LinkedListActions{
    Node append(Node head,int data){
        if(head==null){
            head=new Node(data);
        }
        Node temp=head;
        Node previous=null;
        while(temp.next!=null){
            if(temp.next.next==null){
                previous=new Node(temp.data);
            }
            temp=temp.next;
        }
        temp.next=new Node(data);
        temp.prev=previous;
        return head;
    }
    Node delete(Node head,int data){
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==data){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
    }
    void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.println();
    }
    Node get(Node head,int target){
        Node temp=head;
        while(temp!=null){
            if(temp.data==target){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    void printNodeInfo(Node head,int target){
        Node temp=get(head,target);
        if(temp==null){
            System.out.println("Node not found");
            return;
        }
        System.out.println("currNode= "+temp.data+" prevNode= "+temp.prev.data+" nextnode= "+temp.next.data);
    }
    Node circleList(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        head.prev=temp;
        temp.next=head;
        return head;
    }
}
public class LinkedList{
    public static void main(String [] args) {
        Node head = new Node(10);
        LinkedListActions l=new LinkedListActions();
        for(int i=0;i<10;i++){
            if(i==6){
                l.append(head,6);
            }
            int x=(int)(Math.random()*20);
            l.append(head,x);
        }
        l.printList(head);
        l.printNodeInfo(head,7);
        l.delete(head,6);
        l.printList(head);
        l.circleList(head);
        l.printNodeInfo(head,10);
        l.printList(head);
    }
}
