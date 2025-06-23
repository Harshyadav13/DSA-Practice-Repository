import java.util.Arrays;

import static java.nio.file.Files.find;

public  class DSU {

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

static int[][] dir = {{+1, 0}, {-1, 0}, {0, +1}, {0, -1}};

    public static void main(String[] args) {
        DSU sets = new DSU(rows * cols + 1);

        int[] ans = new int[queries.length];
        boolean[] vis = new boolean[rows * cols + 1];

        int islands = 0;

        for(int i = 0; i < queries.length; i++) {
            int r = queries[i][0], c = queries[i][1];
            int idx = r * cols + c;

            if(vis[idx] == true) {
                ans[i] = island;
                continue;
            }
            vis[idx] = true;
            islands++;

            for(int d =0; d < 4; d++) {
                int nr = r  + dir[d][0];
                int nc = c + dir[d][1];

                int nidx = nr * cols + nc;

                if(nr < 0 || nc < 0 || nr >= rows || nc >= cols || vis[idx] == false) continue;

                if(sets.find(nidx) == sets.find(idx)) continue;;

                sets.union(idx, nidx);

                islands--;
            }

            ans[i] = islands;
        }
        return ans;
    }

}
