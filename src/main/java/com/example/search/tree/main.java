package com.example.search.depthfirstsearch.tree;


public class main {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(0);
        root.left=new TreeNode(1);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        System.out.println("Inorder traversal");
        InOrder.inOrderTraversal(root);
        System.out.println("\nPreorder traversal ");
        PreOrder.preorderTraversal(root);

        System.out.println("\nPostorder traversal");
        PostOrder.postOrderTraversal(root);
    }
}
