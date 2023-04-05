package GraphPackage;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class GraphUtil {

    private Vector<Node> graph;
    private Vector<Edge> edges;
    boolean doublyLinked;

    public GraphUtil(boolean doublyLinked) {
        graph = new Vector<>();
        this.doublyLinked = doublyLinked;
        this.edges = new Vector<>();
    }

    public GraphUtil(Vector<Node> graph,boolean doublyLinked) {
        this.graph = graph;
        doublyLinked = doublyLinked;
    }

    public Node getNode(int value){
        for(Node node:graph){
            if(node.getData() == value){
                return node;
            }
        }
        return null;
    }

    public Edge getEdge(int src,int dest){
        for(Edge edge:edges){
            if(edge.getNodeSrc().getData() == src && edge.getNodeDest().getData() == dest){
                return edge;
            }
        }
        return null;
    }

    public void appendNode(int src,int dest,int weight){
        Node nodeSrc,nodeDest;

        nodeSrc = this.getNode(src);
        nodeDest = this.getNode(dest);

        if(this.getNode(src) == null){
            nodeSrc = new Node(src);
            graph.add(nodeSrc);
        }

        if(this.getNode(dest) == null){
            nodeDest = new Node(dest);
            graph.add(nodeDest);
        }

        if(!nodeSrc.hasChild(nodeDest)){
            Vector<Node> newCollection = nodeSrc.getCollection();
            newCollection.add(nodeDest);

            nodeSrc.setCollection(newCollection);
        }

        if(!nodeDest.hasChild(nodeSrc) && doublyLinked){
            Vector<Node> newCollection = nodeDest.getCollection();
            newCollection.add(nodeSrc);

            nodeDest.setCollection(newCollection);
        }
        edges.add(new Edge(nodeSrc,nodeDest,weight));
    }

    public void deleteNode(int value){
        Node currNode=null;
            for(Node node:graph){
                node.getCollection().removeIf(collected -> collected.getData() == value);
                if(node.getData() == value){
                    currNode = node;
                }
            }
        edges.removeIf(edge -> edge.getNodeSrc().getData() == value || edge.getNodeDest().getData() == value);
            if(currNode!=null){
                graph.remove(currNode);
            }
    }

    public boolean hasPath(int src,int dest){
        Node nodeSrc = this.getNode(src);
        Node nodeDest = this.getNode(dest);

        if(nodeSrc!=null && nodeDest!=null){
            return hasPath(nodeSrc,nodeDest,new Vector<Node>());
        }
        return false;
    }

    public boolean hasPath(Node src,Node dest, Vector<Node> visited){
        if(src.getData() == dest.getData()){
            return true;
        }

        for(Node node:visited){
            if(node.getData() == src.getData()){
                return false;
            }
        }

        visited.add(src);

        for(Node node: src.getCollection()){
            if(this.hasPath(node,dest,visited)){
                return true;
            }
        }
        return false;
    }

    public void shortestPath(int src,int dest){
        shortestPath(this.getNode(src),this.getNode(dest));
    }

    public void shortestPath(Node nodeSrc,Node destination) {
        Vector<Node> unvisited = graph;
        /*for(Node node:unvisited){
            System.out.println(node.getData());
        }*/
        Stack<Node> visited = new Stack<>();

        nodeSrc.setMinimumDistance(0);

        Node currNode = nodeSrc;
        while(!unvisited.isEmpty()){
            Vector<Edge> children = getChildren(currNode);
            for(Edge edge:children){
                if(nodeSrc.getMinimumDistance()+edge.getWeight()<edge.getNodeDest().getMinimumDistance()) {
                    edge.getNodeDest().setMinimumDistance(nodeSrc.getMinimumDistance() + edge.getWeight());
                    edge.getNodeDest().setPreviousNode(currNode);

                    System.out.println("Total: "+edge.getNodeDest().getMinimumDistance());
                    System.out.println("Prev: "+edge.getNodeDest().getPreviousNode().getData());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            for(Node node:unvisited){
                //System.out.println(node.getData()+" = "+nodeSrc.getData());
                if(node.getData() == currNode.getData()){
                    //System.out.println("Entered");
                    unvisited.remove(node);
                    //System.out.println(unvisited.size());
                    System.out.println(unvisited.size());
                    break;
                }
            }
            visited.push(nodeSrc);

           /*int i=0;
            for(Node node:unvisited){
                i++;
            }
            System.out.println(i);*/

            for(Edge child:children){
                for(Node node:unvisited){
                    if(child.getNodeDest().getData() == node.getData()){
                        currNode = node;
                    }
                }
            }
        }

        //System.out.println(this.getNode(destination.getData()).getMinimumDistance());

    }

    public Vector<Edge> getChildren(Node nodeSrc){
        /*if(this.getNode(nodeSrc.getData())==null){
            System.out.println("Entered");
            return null;
        }*/
        Vector<Edge> children = new Vector<>();

        for(Edge edge:edges){
            if(edge.getNodeSrc().getData() == nodeSrc.getData()){

                children.add(edge);
            }
        }
        return children;
    }

    public void printGraph(){
        for(Node node:graph){
            System.out.print(node.getData()+": ");
            for(Node collected: node.getCollection()){
                Edge edge = getEdge(node.getData(),collected.getData());
                System.out.print(collected.getData()+" weight: "+ edge.getWeight()+", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public Vector<Node> getGraph() {
        return graph;
    }

    public void setGraph(Vector<Node> graph) {
        this.graph = graph;
    }
}
