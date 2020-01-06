package Trees;

public class TreeNode {
    public  TreeNode leftChild;
    public TreeNode rightChild;
    private int data;

    public TreeNode(){
        leftChild = null;
        rightChild = null;
        data = 0;
    }
    public TreeNode(int value){
        leftChild= rightChild = null;
        this.data = value;
    }
    public void setData(int value){
        this.data = value;
    }
    public int getData(){
        return data;
    }
}
