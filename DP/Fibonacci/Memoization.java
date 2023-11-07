import java.util.Arrays;
import java.util.Scanner;

public class Memoization {
    public static int fib(int n, int[] dp) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(dp[n] != -1) return dp[n];

        int prev1 = fib(n - 1);
        int prev2 = fib(n - 2);

        dp[n] = prev1 + prev2;
        return prev1 + prev2;
    }
    public static int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
       return  fib(n, dp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}

//time complexity  = O(n)
//space complexity = o(n)