import java.util.Scanner;

//Link = https://www.hackerrank.com/contests/july22-beta-java-dsa-class-challenges/challenges/prime-checker-2-1

public class PrimeNumber {

    public static boolean isPrime(int n) {
        if(n == 1 || n == 2) return true;

        int sqrt = (int)Math.sqrt(n);
        for(int idx = 2; idx <= sqrt; idx++) {
            if(n % idx == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPrime(n);
        if(res == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}


