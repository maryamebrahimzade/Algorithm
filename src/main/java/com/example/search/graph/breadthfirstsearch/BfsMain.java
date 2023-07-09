package com.example.search.graph.breadthfirstsearch;

public class BfsMain {
    public static void main(String[] args) {
        BfsTraversal graph = new BfsTraversal(6);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 3);
        graph.insertEdge(0, 4);
        graph.insertEdge(4, 5);
        graph.insertEdge(3, 5);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 0);
        graph.insertEdge(2, 1);
        graph.insertEdge(4, 1);
        graph.insertEdge(3, 1);
        graph.insertEdge(5, 4);
        graph.insertEdge(5, 3);
        System.out.println("Breadth First Traversal for the graph is:");
        graph.BFS(0);
    }
}
