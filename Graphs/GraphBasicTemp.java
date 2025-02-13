import java.util.*;

class Pair {
    int nbr;
    int weight;

    // Constructor for unweighted edge
    Pair(int nbr) {
        this(nbr, 1);
    }

    // Constructor for weighted edge
    Pair(int nbr, int weight) {
        this.nbr = nbr;
        this.weight = weight;
    }
}

class Graph {
    ArrayList<Pair>[] adj;

    @SuppressWarnings("unchecked")
    Graph(int n) {
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    // Method to add an edge in an unweighted graph
    public void addEdge(int src, int dest, boolean isDirected) {
        adj[src].add(new Pair(dest));
        if (!isDirected) {
            adj[dest].add(new Pair(src));
        }
    }

    // Method to add an edge in a weighted graph
    public void addEdge(int src, int dest, int weight, boolean isDirected) {
        adj[src].add(new Pair(dest, weight));
        if (!isDirected) {
            adj[dest].add(new Pair(src, weight));
        }
    }

    // Method to print adjacency list representation of the graph
    public void printAdjList() {
        for (int i = 0; i < adj.length; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (int j = 0; j < adj[i].size(); j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(adj[i].get(j).nbr);
                if (adj[i].get(j).weight != 1) {
                    System.out.print(" (Weight: " + adj[i].get(j).weight + ")");
                }
            }
            System.out.println();
        }
    }
}

public class GraphBasicTemp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vtces = scn.nextInt();
        Graph g = new Graph(vtces);

        System.out.print("Enter the number of edges: ");
        int edges = scn.nextInt();

        for (int i = 0; i < edges; i++) {
            System.out.print("Enter source vertex, destination vertex, and weight (if weighted): ");
            int src = scn.nextInt();
            int dest = scn.nextInt();
            int weight = scn.nextInt();

            // Assuming the graph is undirected for simplicity
            g.addEdge(src, dest, weight, false);
        }

        System.out.println("\nAdjacency List Representation of the Graph:");
        g.printAdjList();
    }
}
