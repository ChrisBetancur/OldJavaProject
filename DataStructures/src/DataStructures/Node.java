package DataStructures;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.UUID;

public class Node{
    Node left,right;
    Node next,prev;
    LinkedList<Node> list;
    UUID NODE_ID;
    int data;
    HashMap<Node,Integer> edge;
    Node(int data){
        this.data=data;
        list=new LinkedList<Node>();
        edge=new HashMap<>();
    }

    public int assignID() {
        NODE_ID=getID();
        return 0;
    }
    UUID getID(){
        UUID id=UUID.randomUUID();
        return id;
    }
}
