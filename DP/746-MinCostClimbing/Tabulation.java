import java.util.Scanner;

//t.c = O(N) , space complexity = O(N)
public class Tabulation {

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i <= n; i ++) {
            dp[i] = Math.min(dp[i-1], dp[i-2]) + ((i == n) ? 0 : cost[i]);
        }
        return Math.min(dp[n-1], dp[n]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n + 1];

        for(int idx = 0; idx < n; idx++) {
            cost[idx] = sc.nextInt();
        }
        int res = minCostClimbingStairs(cost);
        System.out.println(res);
    }
}
