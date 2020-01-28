package Graph;

public class GraphNode {

    public int value;
    public GraphNode left;
    public GraphNode right;

    public GraphNode() {
    }

    public GraphNode(int value, GraphNode left, GraphNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public GraphNode getLeft() {
        return left;
    }

    public void setLeft(GraphNode left) {
        this.left = left;
    }

    public GraphNode getRight() {
        return right;
    }

    public void setRight(GraphNode right) {
        this.right = right;
    }
}
