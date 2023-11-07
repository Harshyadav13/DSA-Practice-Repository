import java.util.Scanner;

public class SpaceOptimizatoin {

    public static int fib(int n) {
        if (n <= 1) return n;

        int prev1 = 0, prev2 = 1;
        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));

    }
}
