import java.util.Scanner;

//DP - 1st Video
//time complexity  = O(2^n)


public class Recursive {
    public static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int prev1 = fib(n - 1);
        int prev2 = fib(n - 2);

        return prev1 + prev2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}

