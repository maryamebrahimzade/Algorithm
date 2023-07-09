package com.example.search.tree;


public class main {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(0);
        root.left=new TreeNode(1);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        System.out.print("Inorder traversal: ");
        InOrder.inOrderTraversal(root);
        System.out.print("\nPreorder traversal: ");
        PreOrder.preorderTraversal(root);
        System.out.print("\nPostorder traversal: ");
        PostOrder.postOrderTraversal(root);
        System.out.print("\nLevel Order traversal: ");
        LevelOrder.printLevelOrder(root);
    }
}
