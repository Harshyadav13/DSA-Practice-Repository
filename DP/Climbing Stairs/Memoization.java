import java.util.Arrays;
import java.util.Scanner;

public class Memoization {

    public static int Trib(int n, int[] dp) {
        if(n == 0) return 1;
        if(dp[n] != -1) return dp[n];

        int ans1 = (n-1 >= 0) ? Trib(n-1, dp) : 0;
        int ans2 = (n-2 >= 0) ? Trib(n-2, dp) : 0;
        int ans3 = (n-3 >= 0) ? Trib(n-3, dp) : 0;

        dp[n] = ans1 + ans2 + ans3;
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(Trib(n, dp));

    }
}
