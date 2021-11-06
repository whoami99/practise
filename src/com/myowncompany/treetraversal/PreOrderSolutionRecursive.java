package com.company.treetraversal;

import java.util.ArrayList;
import java.util.List;

public class PreOrderSolutionRecursive {
    List<Integer> output = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return output;
        output.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return output;
    }
}
