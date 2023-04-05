import GraphPackage.Edge;
import GraphPackage.GraphUtil;
import GraphPackage.Node;

import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        GraphUtil graphUtil = new GraphUtil(false);

        graphUtil.appendNode(1,2,6);
        graphUtil.appendNode(1,4,1);
        graphUtil.appendNode(4,2,2);
        graphUtil.appendNode(8,3,7);
        graphUtil.appendNode(8,21,100);
        graphUtil.appendNode(21,1,11);
        graphUtil.appendNode(4,1,10);

        //graphUtil.printGraph();

        //System.out.println(graphUtil.hasPath(8,1));

        //graphUtil.deleteNode(8);

        //graphUtil.printGraph();

        graphUtil.shortestPath(8,1);


    }
}
