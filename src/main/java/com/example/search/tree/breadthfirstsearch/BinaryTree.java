package com.example.search.tree.depthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static void printInorder(TreeNode treeNode){
        if(treeNode==null){
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

    public static void printLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>(); //Initialize an empty queue
        queue.add(root); //Start with setting temp as root
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " "); //Print data from temp.

            /*add left child to the queue */
            if(temp.left!=null) {
                queue.add(temp.left);
            }
            /*add right child to the queue */
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }

}
