package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class Node {
    Node left,right;
    Node next,prev;
    LinkedList<Node> list;
    int data;
    HashMap<Node,Integer> edge;
    Node(int data){
        this.data=data;
        list=new LinkedList<Node>();
        edge=new HashMap<>();
    }
}
