import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static int memo(int n, int m) {

        int mod = 1000000007;
        if(n < m) return 1;
        if(n == m) return 2;

        int ans1 = memo(n-1, m);
        int ans2 = memo(n-m, m);

        return (ans1 + ans2) % mod;
    }
    public static int countWays(int n, int m) {
        return memo(n, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(countWays(n, m));
    }
}
