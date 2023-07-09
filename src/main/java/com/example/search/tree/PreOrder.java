package com.example.search.tree;

public class PreOrder {
    public static void preorderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.print(treeNode.data + "->"); // Traverse root
        preorderTraversal(treeNode.left); // Traverse left
        preorderTraversal(treeNode.right); // Traverse right
    }

}
