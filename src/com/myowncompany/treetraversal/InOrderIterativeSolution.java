package com.company.treetraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class InOrderIterativeSolution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> nodeStack = new ArrayDeque<>();
        List<Integer> output = new ArrayList<>();

        if (root != null) {
            nodeStack.add(root);
        }
        TreeNode currentNode = nodeStack.pollLast();
        while (!nodeStack.isEmpty()||currentNode!=null) {
            while (currentNode != null) {
                nodeStack.addLast(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = nodeStack.pollLast();
            output.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return output;
    }
}
