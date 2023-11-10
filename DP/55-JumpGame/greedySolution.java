import java.util.Scanner;

public class greedySolution {
     public static boolean canJump(int[] jumps) {
        int reach = 0;

        for(int i = 0; i < jumps.length; i++) {
            if(i > reach) return false;

            if(i + jumps[i] > reach) {
                reach = i + jumps[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] jumps = new int[n];

        System.out.println(canJump(jumps));
     }
}
