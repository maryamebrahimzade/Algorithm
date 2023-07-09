package com.example.search.graph.depthfirstsearch;

import java.util.Iterator;
import java.util.LinkedList;

public class DfsTraversal {
    private int node;
    private LinkedList<Integer> adj[]; //adjacency list

    public DfsTraversal(int v) {
        this.node = v;
        adj = new LinkedList[node];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    public void DFS(int v)
    {
        boolean visited[] = new boolean[node];
        DFSUtil(v, visited);
    }
}

