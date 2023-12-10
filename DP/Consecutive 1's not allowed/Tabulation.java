import java.util.Scanner;

public class Tabulation {

        public static int countStrings(int n) {
            final int MOD = 1000000007;

            // dp[i][0] represents the count of binary strings of length i ending with 0
            // dp[i][1] represents the count of binary strings of length i ending with 1
            int[][] dp = new int[n + 1][2];

            // Base cases
            dp[1][0] = 1;
            dp[1][1] = 1;

            // Fill the dp array using bottom-up approach
            for (int i = 2; i <= n; i++) {
                dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % MOD; // ending with 0
                dp[i][1] = dp[i - 1][0] % MOD; // ending with 1
            }

            // Calculate the total count by summing up the counts for strings of length n ending with 0 and 1
            int totalCount = (dp[n][0] + dp[n][1]) % MOD;

            return totalCount;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countStrings(n));
    }
    }


