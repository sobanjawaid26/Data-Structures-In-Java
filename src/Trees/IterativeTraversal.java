package Trees;

import java.util.Stack;

public class IterativeTraversal {

    void iterativeInorder(TreeNode root){
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(true){
            if(root != null){
                stack.push(root);
                root = root.leftChild;
            }else{
                if(stack.isEmpty())
                    break;
                root = stack.pop();
                System.out.print(root.getData());
                root = root.rightChild;
            }
        }
    }
}
