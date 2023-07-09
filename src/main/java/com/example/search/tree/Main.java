package com.example.search.tree;


public class Main {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(0);
        root.left=new TreeNode(1);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        System.out.print("Inorder traversal: ");
        BinaryTree.printInorder(root);
        System.out.print("\nPreorder traversal: ");
        BinaryTree.printPreorder(root);
        System.out.print("\nPostorder traversal: ");
        BinaryTree.printPostOrder(root);
        System.out.print("\nLevel Order traversal: ");
        BinaryTree.printLevelOrder(root);
    }
}
