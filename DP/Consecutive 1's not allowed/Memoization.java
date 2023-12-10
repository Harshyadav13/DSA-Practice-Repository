import java.util.Scanner;

public class Memoization {

    //Time complexity = O(2*n) ~= O(N) space complexity = Rcs = O(N) Extra Space = O(N)

        public static long memo(int noOfDigits, int prevDigits, long[][] dp) {

            long mod = 1000000007;

            if(noOfDigits == 0) return 1;
            if(dp[noOfDigits][prevDigits] != 0) return dp[noOfDigits][prevDigits];

            long append0 = memo(noOfDigits - 1, 0, dp);
            long append1 = (prevDigits == 0) ? memo(noOfDigits - 1, 1, dp) : 0;


            return  dp[noOfDigits][prevDigits] = (append0 + append1) % mod;
        }
        public static long countStringss(int n) {
            // code here
            long[][] dp = new long[n + 1][2];

            return memo(n, 0, dp);

        }

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(countStringss(n));
        }
    }


