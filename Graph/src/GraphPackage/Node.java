package GraphPackage;

import java.util.Vector;

public class Node {

    private int data;

    private int minimumDistance;
    private Node previousNode;

    private Vector<Node> collection;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.collection = new Vector<>();
        this.minimumDistance = Integer.MAX_VALUE;
    }

    public Node(int data, Vector<Node> collection) {
        this.data = data;
        this.collection = collection;
    }

    public boolean hasChild(Node node){
        if(node!=null){
            for(Node currNode:collection){
                if(currNode.getData() == node.getData()){
                    return true;
                }
            }
        }
        return false;
    }

    public Vector<Node> getCollection() {
        return collection;
    }

    public void setCollection(Vector<Node> collection) {
        this.collection = collection;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getMinimumDistance() {
        return minimumDistance;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public void setMinimumDistance(int minimumDistance) {
        this.minimumDistance = minimumDistance;
    }
}
