package com.example.search.depthfirstsearch.tree;

public class InOrder {
    public static void inOrderTraversal(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        inOrderTraversal(treeNode.left); // Traverse left
        System.out.println(treeNode.data + "->"); // Traverse root
        inOrderTraversal(treeNode.right); // Traverse right

    }
}
