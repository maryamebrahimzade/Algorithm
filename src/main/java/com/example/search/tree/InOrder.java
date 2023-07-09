package com.example.search.tree;

public class InOrder {
    public static void inOrderTraversal(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        inOrderTraversal(treeNode.left); // Traverse left
        System.out.print(treeNode.data + "->"); // Traverse root
        inOrderTraversal(treeNode.right); // Traverse right

    }
}
