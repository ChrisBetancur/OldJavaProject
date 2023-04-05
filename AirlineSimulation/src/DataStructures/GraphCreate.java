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
    void addEdge(int target,int destin,int weight){
        Node src=getNode(target);
        Node dest=getNode(destin);

        if(src==null){
            src=new Node(target);
        }
        if(dest==null){
            dest=new Node(destin);
        }
        if(src.list.contains(dest)==false){
            src.list.add(dest);
            src.edge.put(dest,weight);
        }
        if(graph.contains(src)==false){
            graph.add(src);
        }
        if(graph.contains(dest)==false){
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
    /*LinkedList<Node> DijkstraAlg(Node src,Node dest){

    }*/
}

public class GraphCreate {
    public static void main(String [] args){

        Graph l=new Graph();

        l.addEdge(1,5,5);
        l.addEdge(3,7,2);
        l.addEdge(4,7,4);
        l.addEdge(5,9,1);
        l.addEdge(3,36,6);
        l.addEdge(9,3,5);
        l.addEdge(1,8,52);


        l.printGraph();
        System.out.println(l.hasPathDFS(3,9));
        l.printPath();
    }
}
