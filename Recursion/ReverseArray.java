import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int[] arr, int idx) {
        if(idx == arr.length) {
            return;
        }
        reverse(arr, idx + 1);
        System.out.println(arr[idx] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int idx = 0;
        reverse(array, 0);
    }
}
