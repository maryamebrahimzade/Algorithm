package com.example.search.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal { //bidirectional
    private int node; //total number of nodes in the graph
    private LinkedList<Integer> adj[]; //adjacency list
    private Queue<Integer> que; //maintaining a queue

    public BFSTraversal(int v) {
        node = v;
        adj = new LinkedList[node];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }

    public void insertEdge(int v, int w) {
        adj[v].add(w); //adding an edge to the adjacency list
    }

    public void BFS(int n) {
        boolean nodes[] = new boolean[node]; //initialize boolean array for holding the data
        int a = 0;
        nodes[n] = true;
        que.add(n); //root node is added to the top of the queue
        while (que.size() != 0) {
            n = que.poll();//remove the top element of the queue
            System.out.print(n + " "); //print the top element of the queue
            for (int i = 0; i < adj[n].size(); i++) { //iterate through the linked list and push all neighbors into queue
                a = adj[n].get(i);
                if (!nodes[a]) { //only insert nodes into queue if they have not been explored already
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }
}
