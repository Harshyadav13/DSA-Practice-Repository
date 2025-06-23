import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public static class Pair {
    int src; // The current cell in the board
    int dist; // Number of dice rolls taken to reach this cell

    Pair(int src, int dist) {
        this.src = src;
        this.dist = dist;
    }
}
public static int BFS(ArrayList<Integer>[] adj) {
    Queue<Pair> q = new LinkedList<>();
    q.add(new Pair(1, 0)); // Start from cell 1 with 0 dice rolls

    int[] vis = new int[adj.length + 1];
    Arrays.fill(vis, -1); // Initialize all cells as unvisited

    while (q.size() > 0) {
        Pair front = q.remove(); // Remove the front of the queue

        if (vis[front.src] != -1) continue; // If already visited, skip it
        vis[front.src] = front.dist; // Mark as visited with the number of moves

        // Visit all neighbors of the current cell
        for (Integer nbr : adj[front.src]) {
            q.add(new Pair(nbr, front.dist + 1));
        }
    }
    return vis[adj.length - 1]; // Return the minimum rolls needed to reach the last cell
}
public int SnakeandLadder(int[][] matrix) {

    ArrayList<Integer> board = new ArrayList<>();
    board.add(0); // Dummy index (1-based indexing)

    int level = 0, cell = 1;

    // Convert the 2D board to a 1D list representation
    for (int i = matrix.length - 1; i >= 0; i--) { // Traverse from bottom row
        if (level % 2 == 0) { // Left to right
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == -1)
                    board.add(cell); // Normal cell
                else
                    board.add(matrix[i][j]); // Ladder/Snake cell
                cell++;
            }
        } else { // Right to left
            for (int j = matrix.length - 1; j >= 0; j--) {
                if (matrix[i][j] == -1)
                    board.add(cell);
                else
                    board.add(matrix[i][j]);
                cell++;
            }
        }
        level++; // Switch direction in the next row
    }
    int size = matrix.length * matrix.length;
    ArrayList<Integer>[] adj = new ArrayList[size + 1];

    for (cell = 1; cell < size; cell++) {
        adj[cell] = new ArrayList<>();
        for (int d = 1; d <= 6 && cell + d < size; d++) { // Simulate dice rolls (1-6)
            if (cell == board.get(cell + d)) continue; // Avoid self-loops
            adj[cell].add(board.get(cell + d)); // Connect the graph
        }
    }
    return BFS(adj); // Find shortest path using BFS
}

public void main() {
}


