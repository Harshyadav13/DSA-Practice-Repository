import java.util.Scanner;

public class Recursion {


    public static long memo(int noOfDigits, int prevDigits, long[][] dp) {
        long mod = 1000000007;
        if(noOfDigits == 0) return 1;


        long append0 = memo(noOfDigits - 1, 0, dp);
        long append1 = (prevDigits == 0) ? memo(noOfDigits - 1, 1, dp) : 0;


        return  (append0 + append1) % mod;
    }
    public static long countString(int n) {
        long[][] dp = new long[n + 1][n + 1];
        return memo(n, 0, dp);
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        System.out.println(countString(n));
    }
}
