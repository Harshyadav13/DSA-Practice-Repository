import java.util.Scanner;

public class printMaxofArray {

    public static int Max(int[] array, int idx) {

        if(idx == array.length) {
            return Integer.MIN_VALUE;
        }

        int k1 = Max(array, idx + 1);

        int maximum = Math.max(k1, array[idx]);
        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n . . . ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter values of Array . . . ");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int ans = (Max(array, 0));
        System.out.println("Maximum number in array is  " +  ans);
    }
}
