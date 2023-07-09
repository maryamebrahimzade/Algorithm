package com.example.search.tree;

public class PostOrder {
    public static void postOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        postOrderTraversal(treeNode.left); // Traverse left
        postOrderTraversal((treeNode.right)); // Traverse right
        System.out.print(treeNode.data + "->"); // Traverse root
    }
}
