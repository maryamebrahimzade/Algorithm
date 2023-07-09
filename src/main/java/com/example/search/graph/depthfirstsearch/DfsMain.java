package com.example.search.graph.depthfirstsearch;

public class DfsMain {
    public static void main(String[] args) {
        DfsTraversal g = new DfsTraversal(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 1)");
        g.DFS(1);
    }
}
