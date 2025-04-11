class Solution {
    
    public static class Pair implements Comparable<Pair> {
        int stop;      // Current bus stop
        int color;     // Bus route number (like edge color)
        int changes;   // Number of bus route changes taken to reach this stop

        public Pair(int stop, int color, int changes) {
            this.stop = stop;
            this.color = color;
            this.changes = changes;
        }

        public int compareTo(Pair other) {
            return this.changes - other.changes;  // Minimize bus changes
        }
    }

    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) return 0;

        int n = 0;
        for (int[] route : routes) {
            for (int stop : route) {
                n = Math.max(n, stop); // To define graph size
            }
        }

        // Graph: for each stop, list of (nextStop, routeNumber)
        ArrayList<Pair>[] adj = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        // Add bidirectional edges between stops in same route
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                int curr = routes[i][j];
                int next = routes[i][(j + 1) % routes[i].length];
                adj[curr].add(new Pair(next, i, 0));
                adj[next].add(new Pair(curr, i, 0));
            }
        }

        // BFS/Best First Search
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(source, routes.length, 0));  // Start with "no bus taken"

        // Visited array: [stop][route] => changes used
        int[][] vis = new int[n + 1][routes.length + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(vis[i], -1);
        }

        if (adj[source].size() == 0) return -1; // No outgoing buses

        while (!q.isEmpty()) {
            Pair top = q.poll();

            if (top.stop == target) return top.changes;

            if (vis[top.stop][top.color] != -1) continue;
            vis[top.stop][top.color] = top.changes;

            for (Pair nbr : adj[top.stop]) {
                if (top.color == nbr.color) {
                    q.add(new Pair(nbr.stop, nbr.color, top.changes)); // Same route, no change
                } else {
                    q.add(new Pair(nbr.stop, nbr.color, top.changes + 1)); // Route change
                }
            }
        }

        return -1;
    }
}
