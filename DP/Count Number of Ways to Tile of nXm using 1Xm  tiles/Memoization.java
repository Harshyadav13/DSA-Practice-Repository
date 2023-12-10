import java.util.Arrays;
import java.util.Scanner;
//Time complexity = O(N) space complexity = RCS = O(N), Dp[table] = O(N) overall space = O(N)
public class Memoization {
    public static int memo(int n, int m, int[] dp) {
        
        if(dp[n] != -1) return dp[n];

        int mod = 1000000007;

        if(n < m) return 1;
        if(n == m) return 2;

        int ans1 = memo(n-1, m, dp);
        int ans2 = memo(n-m, m, dp);

        return dp[n] = (ans1 + ans2) % mod;
    }
    public static int countWays(int n, int m) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return memo(n, m, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(countWays(n, m));
    }
}
