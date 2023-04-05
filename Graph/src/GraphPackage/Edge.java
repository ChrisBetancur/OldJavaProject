package GraphPackage;

public class Edge {

    private Node nodeSrc;
    private Node nodeDest;
    private int weight;

    public Edge(Node nodeSrc, Node destNode, int weight) {
        this.nodeSrc = nodeSrc;
        this.nodeDest = destNode;
        this.weight = weight;
    }

    public Node getNodeSrc() {
        return nodeSrc;
    }

    public void setNodeSrc(Node nodeSrc) {
        this.nodeSrc = nodeSrc;
    }

    public Node getNodeDest() {
        return nodeDest;
    }

    public void setNodeDest(Node nodeDest) {
        this.nodeDest = nodeDest;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
