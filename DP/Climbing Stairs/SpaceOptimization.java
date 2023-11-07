import java.util.Scanner;

//T.c. = O(n) space complexity = O(1)

public class SpaceOptimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev1 = 1, prev2 = 0, prev3 = 0;
        for(int i = 1; i <= n; i++) {
            int curr = prev1 + prev2 + prev3;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }
}
