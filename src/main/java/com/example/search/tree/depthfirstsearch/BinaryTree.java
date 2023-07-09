package com.example.search.tree.depthfirstsearch;

public class BinaryTree {
    public static void printInorder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        printInorder(treeNode.left); // Traverse left
        System.out.print(treeNode.data + "->"); // Traverse root
        printInorder(treeNode.right); // Traverse right
    }

    public static void printPreorder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.print(treeNode.data + "->"); // Traverse root
        printPreorder(treeNode.left); // Traverse left
        printPreorder(treeNode.right); // Traverse right
    }

    public static void printPostOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        printPostOrder(treeNode.left); // Traverse left
        printPostOrder((treeNode.right)); // Traverse right
        System.out.print(treeNode.data + "->"); // Traverse root
    }
}
