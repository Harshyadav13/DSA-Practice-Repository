

import java.util.ArrayList;
import java.util.Scanner;

public class getStairsPaths {

    public static ArrayList<String> getPaths(int n) {

//        if(n < 0) {
//            ArrayList<String> paths = new ArrayList<>();
//            return paths;
//        }
         if(n == 0) {
            ArrayList<String> newPaths = new ArrayList<>();
            newPaths.add("");
            return newPaths;
        }

         ArrayList<String> res = new ArrayList<>();

        if(n - 1 >= 0) {
            ArrayList<String> futurePaths1 = getPaths(n - 1);
            for(String s1 : futurePaths1)
                res.add(1 + s1);
        }
        if(n-2  >= 0) {
            ArrayList<String> futurePaths2 = getPaths(n - 2);
            for(String s2 : futurePaths2)
                res.add(2 + s2);
        }
        if(n-3 >= 0) {
            ArrayList<String> futurePaths3 = getPaths(n - 3);
            for(String s3 : futurePaths3)
                res.add(3 + s3);
        }


        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        int n = sc.nextInt();

        ArrayList<String> res = getPaths(n);
        System.out.println(res);
    }
}
