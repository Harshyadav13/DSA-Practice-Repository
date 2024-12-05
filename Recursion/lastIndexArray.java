import java.util.Scanner;

public class lastIndexArray {

    public static int lastIndex(int[] array, int idx, int d) {
        if(idx < 0) return -1;
        if(array[idx] == d) return idx;
        int val = lastIndex(array, idx - 1, d);
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the Array ");
        for(int idx  = 0; idx < n; idx++) {
            array[idx] = sc.nextInt();
        }
        System.out.println("Enter the finding number ");
        int d  = sc.nextInt();
        int ans = lastIndex(array, array.length-1, d);
        System.out.println("th Last Index is " + ans);
    }
}
