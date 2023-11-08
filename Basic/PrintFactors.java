import java.util.Scanner;

//Link =  https://www.hackerrank.com/contests/july22-beta-java-dsa-class-challenges/challenges/print-all-factors-of-a-number

public class PrintFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int idx = 1; idx <= n/2; idx++) {
            if(n % idx == 0) {
                System.out.println(idx);
            }
        }
        if(n > 1) System.out.println(n);
    }
}

