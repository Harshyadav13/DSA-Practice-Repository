import java.util.Scanner;

//Link = https://pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-decreasing-official/ojquestion

public class PrintNTo1 {
    public static void  printDecreasing(int n) {
        if(n == 0) return;

        System.out.println(n);
        printDecreasing(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
}
