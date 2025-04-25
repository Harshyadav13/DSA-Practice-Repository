import java.util.Arrays;

import static java.nio.file.Files.find;

public class DSU {

    int[] parent;
    int[] rank;

    public DSU(int n) {
           parent = new int[n];
           Arrays.fill(parent, -1);
           rank = new int[n];
        }

    public void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if(pa == pb) return;

        if(rank[pa] > rank[pb]) {
            parent[pb] = pa;
            rank[pa] += rank[pb];
        }
        else {
            parent[pa] = pb;
            rank[pb] += rank[pa];
        }
    }

public int find(int a) {
        if(parent[a] == -1) return a;
        return parent[a] = find(parent[a]);
}

}
