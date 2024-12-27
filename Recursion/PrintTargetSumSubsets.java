import java.util.Scanner;

public class PrintTargetSumSubsets {

    public  static void printTargetsum(int[] arr, int idx, String output, int currSum, int target) {

        if(idx == arr.length) {
            if(currSum == target) {
                System.out.println(output + " ");
            }
            return;
        }

        if(currSum > target ) return;
        int ele = arr[idx];
        printTargetsum(arr, idx +1, output + ele + ", ", currSum + ele, target);
        printTargetsum(arr, idx + 1, output, currSum, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        printTargetsum(arr, 0, "", 0, target);
    }
}
