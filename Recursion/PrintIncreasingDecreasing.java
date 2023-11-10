import java.util.Scanner;

//Link = https://pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-increasing-decreasing-official/ojquestion

public class PrintIncreasingDecreasing {
    public static void  printIncrDecr(int n) {
        if(n == 0) return;

        System.out.println(n);
        printIncrDecr(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncrDecr(n);
    }
}
