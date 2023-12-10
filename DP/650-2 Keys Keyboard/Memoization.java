import java.util.Scanner;

public class Memoization {

    //time complexity = O(N^2  )
    public static long memo(int screen, int buffer, long dest, long[][] dp) {

        if(screen > dest) return Integer.MAX_VALUE;
        if(screen == dest) return 0;

        if(dp[screen][buffer] != -1l) return dp[screen][buffer];

        long copyPaste = 2l + memo(2 * screen, screen, dest, dp);
        long paste = 1l + memo(screen + buffer, buffer, dest, dp);

        return dp[screen][buffer] = Math.min(copyPaste, paste);

    }
    public static int minSteps(int n) {

        if(n == 1) return 0;
        long[][] dp =  new long[2 * n + 1][2 * n + 1];
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        return (int)(1l +memo(1, 1, n, dp));
        //passing 1, 1 because screen has one character and buffer cannot be passed empty so that it should not stuck in infinite empty loop and give stack overflow
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

        System.out.println(minSteps(n));
    }
}
