import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getSubsets {

    public static List<List<Integer>>  subSets(int[] nums, int idx) {

        if(idx == nums.length) {
            List<List<Integer>> bres = new ArrayList<>();
            bres.add(new ArrayList<>());
            return bres;
        }

            List<List<Integer>> tres = subSets(nums, idx + 1);
            List<List<Integer>> res = new ArrayList<>();

            //this will run loop on [] => inside list which is return by base condition [[]]
            for(List<Integer> i : tres) {
                List<Integer> newSubset = new ArrayList<>();
                newSubset.add(nums[idx]);
                //this will run loop inside elements of i
                for(Integer j : i) {
                    newSubset.add(j);
                }
                res.add(newSubset);

                res.add(i);
            }
            return res;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        List<List<Integer>> res = subSets(array, 0);
        for(List<Integer> i : res) {
            System.out.println(i);
        }
    }
}
