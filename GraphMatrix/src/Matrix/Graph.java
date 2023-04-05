package Matrix;

public class Graph {

    private int numOfNodes;
    private boolean isDirected;
    private int[][] matrix;
    private boolean[][] isSetMatrix;

    public Graph(int numOfNodes, boolean isDirected) {
        this.numOfNodes = numOfNodes;
        this.isDirected = isDirected;
        matrix = new int[numOfNodes][numOfNodes];
        isSetMatrix = new  boolean[numOfNodes][numOfNodes];
    }

    public void appendEdge(int source, int destination, int weight) {
        matrix[source][destination] = weight;
        isSetMatrix[source][destination] = true;

        if(isDirected) {
            matrix[destination][source] = weight;
            isSetMatrix[destination][source] = true;
        }
    }

    public void printMatrix() {
        int index = 0;
        for(int row = 0; row < numOfNodes; row++) {
            System.out.print(row + ": ");
            for(int col = 0; col < numOfNodes; col++) {
                if(isSetMatrix[row][col]) {
                    System.out.print(col+" weight = "+matrix[row][col]+", ");
                }
            }
            System.out.println();
        }
    }
}
