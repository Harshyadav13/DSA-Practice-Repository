import java.util.Scanner;

public class printDecreasing {

    public static void printDecreasingg(int n) {
        if (n == 0) return;
        System.out.println(n);
        printDecreasingg(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasingg(n);
    }


}
