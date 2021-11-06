package com.company.treetraversal;

import java.util.ArrayList;
import java.util.List;

public class InorderMorrisTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();

        if(root == null){
            return output;
        }

        TreeNode currentNode = root;

        while(currentNode!=null){

            if(currentNode.left==null){
                output.add(currentNode.val);
                currentNode = currentNode.right;
            }
            else{
                TreeNode predecessor = currentNode.left;
                while(predecessor.right!=null&&predecessor.right!=currentNode){
                    predecessor = predecessor.right;
                }
                if(predecessor.right==null){
                    predecessor.right = currentNode;
                    currentNode = currentNode.left;
                }
                else{
                    predecessor.right = null;
                    output.add(currentNode.val);
                    currentNode = currentNode.right;
                }
            }
        }
        return output;
    }
}
