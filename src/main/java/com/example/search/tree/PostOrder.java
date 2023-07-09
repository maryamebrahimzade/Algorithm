package com.example.search.depthfirstsearch.tree;

public class PostOrder {
    public static void postOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        postOrderTraversal(treeNode.left); // Traverse left
        postOrderTraversal((treeNode.right)); // Traverse right
        System.out.println(treeNode.data + "->"); // Traverse root
    }
}
