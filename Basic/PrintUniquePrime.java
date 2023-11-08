
//Link = https://www.hackerrank.com/contests/july22-beta-java-dsa-class-challenges/challenges/print-all-unique-prime-factors

import java.util.Scanner;

public class PrintUniquePrime {

    public static boolean isPrime(int n) {
        int sqrt = (int)(Math.sqrt(n));
        if(n == 1 || n == 2) return true;

        for(int idx = 2; idx <= sqrt; idx++) {
            if(n % idx == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0 && isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }
}
