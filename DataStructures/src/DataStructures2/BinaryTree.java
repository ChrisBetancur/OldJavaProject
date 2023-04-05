package DataStructures2;

class Node {
    private int data;
    private Node left, right;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

class Tree {
    public Node root;

    public void append(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }

        append(this.root, data);
    }

    private Node append(Node currNode, int data) {
        if (currNode == null) {
            currNode = new Node(data);
        }

        else {
            if (currNode.getData() > data) {
                currNode.setLeft(append(currNode.getLeft(), data));
            }
            else {
                currNode.setRight(append(currNode.getRight(), data));
            }
        }
        return currNode;
    }

    public void delete(int data) {

    }

    private int minVal(Node node) {
        if (node.getLeft() != null) {
            return minVal(node.getLeft());
        }
        else {
            return node.getData();
        }
    }

    public void traverse() {
        traverse(this.root);
    }

    private void traverse(Node currNode) {
        if (currNode != null) {
            traverse(currNode.getRight());
            System.out.println(currNode.getData());
            traverse(currNode.getLeft());
        }
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.append(4);
        tree.append(9);
        tree.append(2);
        tree.append(5);
        tree.traverse();
    }
}
