import java.util.Scanner;

//T.c = O(n)  Space-complexity = O(n)

public class Tabulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n ; i++) {
            int ans1 = (i - 1 >= 0) ? dp[i-1] : 0;
            int ans2 = (i - 2 >= 0) ? dp[i-2] : 0;
            int ans3 = (i - 3 >= 0) ? dp[i-3] : 0;

            dp[i] = ans1 + ans2 + ans3;
        }
        System.out.println(n);
    }
}
