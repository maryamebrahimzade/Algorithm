package com.example.search.tree.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
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
