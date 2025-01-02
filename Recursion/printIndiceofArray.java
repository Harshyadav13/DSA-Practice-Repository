import java.util.ArrayList;
import java.util.Scanner;

public class printIndiceofArray {

    public static void  allIndexesofTarget(int[] array, int target, int idx, ArrayList<Integer> res) {
            if(idx == array.length) return;

            if(array[idx] == target) {
                res.add(idx);
            }
            allIndexesofTarget(array, target, idx + 1, res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        allIndexesofTarget(array, target, 0, res);
        if(res.size() == 0) {
            System.out.println();
            return;
        }

        for (Integer i : res) {
            System.out.println(i);
        }

    }
}
