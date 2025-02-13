import java.util.*;

public class getConnectedComponentsOfGraphs {
    static class Edge {
        int src, nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    public static void DFS(int src, ArrayList<Edge>[] graph, boolean[] vis, List<Integer> component) {
        if (vis[src] == true) return;  // If node is already visited, return

        vis[src] = true;        // Mark node as visited
        component.add(src);     // Add node to the current component

        for (Edge e : graph[src]) {
            DFS(e.nbr, graph, vis, component);  // Visit all neighbors
        }
    }

    public static void connectedComponents(ArrayList<Edge>[] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];  // Visited array
        List<List<Integer>> components = new ArrayList<>(); // Stores all components

        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {  // If node i is not visited, it's a new component
                List<Integer> component = new ArrayList<>();
                DFS(i, graph, vis, component);  // Perform DFS for this component
                components.add(component);
            }
        }

        System.out.println(components); // Print all connected components
    }

    public static void main(String[] args) {
        int n = 7; // Number of nodes (0 to 6)
        ArrayList<Edge>[] graph = new ArrayList[n];

        // Initialize adjacency list
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges (Undirected Graph)
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 5, 6);

        // Find and print all connected components
        connectedComponents(graph);
    }

    // Helper method to add an edge (undirected)
    public static void addEdge(ArrayList<Edge>[] graph, int u, int v) {
        graph[u].add(new Edge(u, v));
        graph[v].add(new Edge(v, u)); // Since the graph is undirected
    }

  
}
