import java.util.Scanner;

public class firstIndexInArray {

    public static int firstIndex(int[] array, int idx, int d) {
        if(idx == array.length) return -1;
        if(array[idx] == d) return idx;

        int val = firstIndex(array, idx + 1, d);
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array... ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the value of Array ");
        for(int idx = 0; idx < n; idx++) {
            array[idx] = sc.nextInt();
        }
        System.out.println("Enter the value of finding number ... ");
        int d  = sc.nextInt();
        int ans = firstIndex(array, 0, d);
        System.out.println("First Index is at " + ans);
    }
}
