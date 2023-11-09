import java.util.Arrays;
import java.util.Scanner;

public class Tabulaton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] jumps = new int[n + 1];
        for (int idx = 0; idx < n; idx++) {
            jumps[idx] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        dp[n] = 1;

        for(int i = n-1; i >= 0; i--) {
            int ans = 0;
            for(int j = 1; j <= jumps[n]; j++) {
                if(i + j <= n) {
                    ans += dp[i + j];
                }
            }
            dp[i] = ans;
        }
        System.out.println(dp[0]);

    }
}
