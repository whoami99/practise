package com.company.treetraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PreOrderIterativeSolution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Deque<TreeNode> nodeStack = new ArrayDeque<>();
        List<Integer> output = new ArrayList<>();

        if (root!= null){
            nodeStack.add(root);
        }
        while (!nodeStack.isEmpty()){
            TreeNode currentNode = nodeStack.pollLast();
            output.add(currentNode.val);
            if(currentNode.right!=null)
                nodeStack.addLast(currentNode.right);
            if(currentNode.left!=null)
                nodeStack.addLast(currentNode.left);
        }
        return output;
    }
}
