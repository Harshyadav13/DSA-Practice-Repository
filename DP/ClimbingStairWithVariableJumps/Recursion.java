import java.util.Arrays;
import java.util.Scanner;

//DP - 2nd Video
//Link = https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-with-variable-jumps-official/ojquestion

//SPACE OPTIMIZATION SOLUTION IS NOT POSSIBLE BECAUSE (JUMP VALUE IF NOT FIXED)
//time complexity = O(n) space complexity = O(n)= recursion call stack
public class Recursion {

    public static int memo(int n, int[] jumps, int[] dp) {
        if(n == jumps.length) return 1;

        int ans = 0;
        for(int i = 1; i <= jumps[n]; i++) {
            if(n + i <= jumps.length)
            ans += memo(n + i, jumps, dp);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] jumps = new int[n + 1];

        for(int idx = 0; idx < n; idx++) {
            jumps[idx] = sc.nextInt();
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(memo(0, jumps, dp));
    }
}
