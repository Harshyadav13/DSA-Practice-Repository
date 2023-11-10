import java.util.Arrays;
import java.util.Scanner;

public class memoization {
    public long memo(int src, int[] jumps, long[] dp) {
        if (src == jumps.length - 1)
            return 0; // min moves to go to dest from dest is 0 (empty string)
        if (dp[src] != -1)
            return dp[src];

        long min = Integer.MAX_VALUE;
        for (int jump = 1; jump <= jumps[src]; jump++) {
            if (src + jump < jumps.length) {
                min = Math.min(min, memo(src + jump, jumps, dp) + 1l);
            }
        }

        dp[src] = min;
        return min;
    }

    public int jump(int[] jumps) {
        long[] dp = new long[jumps.length + 1];
        Arrays.fill(dp, -1);

        return (int) memo(0, jumps, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] jumps = new int[n];

        System.out.println(jumps);
    }
}
