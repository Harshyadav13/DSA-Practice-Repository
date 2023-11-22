import java.util.Scanner;

public class SpaceOptimization {

    public static int minCostClimbing(int[] cost) {
        int n = cost.length;

        int prev1 = cost[0];
        int prev2 = cost[1];

        for(int i = 2; i <= n; i++) {

            int curr = Math.min(prev1, prev2) + cost[i];
            prev1 = prev2;
            prev2 = curr;
        }
        return Math.min(prev1, prev2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n];

        for(int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        System.out.println(minCostClimbing(cost));
    }

}
