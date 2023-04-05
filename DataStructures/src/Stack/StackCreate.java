package Stack;

class Node{
    Node next;
    int data;
    public Node(int data) {
        this.data = data;
    }
}
class Stack{
    public Node push(Node top,int data){
        if(top==null){
            top=new Node(data);
            return top;
        }
        Node newTop=new Node(data);
        newTop.next=top;
        top=newTop;
        return top;
    }
    public Node pop(Node top){
        top=top.next;
        return top;
    }
    public void printStack(Node top){
        Node curr=top;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
public class StackCreate {
    public static void main(String[] args){
        Stack stack=new Stack();
        Node top=new Node(8);
        top=stack.push(top,3);
        top=stack.push(top,3);
        top=stack.push(top,4);
        //stack.printStack(top);
        top=stack.pop(top);
        stack.printStack(top);
    }
}
