package DataStructures;

import java.util.*;
import java.util.LinkedList;

class Edges{
    Node src;
    Node dest;
    int weight;
    Edges(int weight,Node src,Node dest){
        this.weight=weight;
        this.src=src;
        this.dest=dest;
    }
}
class Graph{
    ArrayList<Node> graph;
    LinkedList<Node> path;
    Graph(){
        graph=new ArrayList<>();
        path=new LinkedList<Node>();
    }
    boolean ifContains(Node curr){
        if(curr!=null){
            for(Node x:graph){
                if(x.data==curr.data){
                    return true;
                }
            }
        }
        return false;
    }
    Node getNode(int data){
        for(Node x:graph){
            if(x.data==data){
                return x;
            }
        }
        return null;
    }
    void addEdge(int target,int destin){
        Node src=getNode(target);
        Node dest=getNode(destin);
        if(src==null){
            src=new Node(target);
            src.assignID();
        }
        if(dest==null){
            dest=new Node(destin);
            dest.assignID();
        }
        if(!src.list.contains(dest)){
            src.list.add(dest);
        }
        if(!graph.contains(src)){
            graph.add(src);
        }
        if(!graph.contains(dest)){
            graph.add(dest);
        }

    }
    void printGraph(){
        for(Node x:graph){
            printNode(x);
            System.out.println();
        }
    }
    void printNode(Node target){
        if(target!=null){
            System.out.print(target.data+": ");
            for(Node x:target.list){
                System.out.print(x.data+", ");
            }
        }
    }
    boolean hasPathDFS(int source,int destination){
        Node src=getNode(source);
        Node dest=getNode(destination);
        ArrayList<Integer> visited=new ArrayList<Integer>();
        return hasPathDFS(src,dest,visited);
    }
    boolean hasPathDFS(Node src,Node dest,ArrayList<Integer> visited){
        if(visited.contains(src.data)){
            return false;
        }
       // visited.add(src.data);
        if(src==dest){
            return true;
        }
        path.add(src);
        visited.add(src.data);
        System.out.print(src.data+"->");
        for(Node child:src.list){
            if(hasPathDFS(child,dest,visited)){
                path.add(child);
                System.out.print(child.data+"->");
                return true;
            }
        }
        return false;
    }
    void printDFSpath(LinkedList<Node> p) {
        for (Node x : p) {
            System.out.print(x.data + "->");
        }
    }
    void printPath(){
        printDFSpath(path);
    }
    LinkedList<Node> DijkstraAlg(Node src,Node dest){
return null;
    }
}

public class GraphCreate {
    public static void main(String [] args){

        Graph l=new Graph();

        l.addEdge(1,5);
        l.addEdge(3,7);
        l.addEdge(4,7);
        l.addEdge(5,9);
        l.addEdge(3,36);
        l.addEdge(9,3);
        l.addEdge(1,8);

        l.printGraph();
        System.out.println(l.hasPathDFS(3,9));
        l.printPath();
        System.out.println();
        Node temp=l.getNode(5);
        System.out.println(temp.NODE_ID);
    }
}
