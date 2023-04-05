package Matrix;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10, true);
        graph.appendEdge(5, 9, 4);
        graph.appendEdge(8, 9, 1);
        graph.printMatrix();
    }
}
