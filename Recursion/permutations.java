import java.util.Scanner;

public class permutations {

    public static void permutation (int currentBox,
            int n,
            int k,
            boolean[] vis,
            String boxes,
            int itemsPlacedCount
    ) {
        // Base case
        if (currentBox == n) {
            if (itemsPlacedCount == k) {
                System.out.println(boxes);
            }
            return;
        }

        // ✅ YES calls – try placing each item in this box
        for (int i = 0; i < k; i++) {
            if (vis[i] == false) {
                vis[i] = true; // mark item used
                permutation(currentBox + 1, n, k, vis, boxes + (i + 1), itemsPlacedCount + 1);
                vis[i] = false; // backtrack
            }
        }

        // ❌ NO call – skip placing anything in this box
        permutation(currentBox + 1, n, k, vis, boxes + "0", itemsPlacedCount);
    }


    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = 3;
            int k = 2;
            boolean[] vis = new boolean[k];
            String out = "";
            permutation(0, n, k, vis,  out,  0);

    }
}
