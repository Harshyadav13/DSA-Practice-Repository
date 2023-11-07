import java.util.Scanner;

//time complexity = O(3^n) Space complexity & recursion call stack = O(n)
//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-official/ojquestion

public class Recursion {

    public static int Trib(int n) {
        if(n == 0) return 1;

        int ans1 = (n-1 >= 0) ? Trib(n-1) : 0;
        int ans2 = (n-1 >= 0) ? Trib(n-2) : 0;
        int ans3 = (n-1 >= 0) ? Trib(n-3) : 0;

        return ans1 + ans2 + ans3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Trib(n));
    }
}

