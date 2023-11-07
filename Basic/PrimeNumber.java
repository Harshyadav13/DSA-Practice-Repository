import java.util.Scanner;

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


// pg No. 10 prime checker 2
//    Write a Java program to check whether a number is a Prime number or not.

//        Input Format
//
//        The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
//
//        For each test case,
//
//        First line contain an integer N.
//
//        Constraints
//
//        1 <= N <= 10^4
//        Output Format
//
//        Print Yes or No.
//
//        Sample Input 0
//
//        1
//        5
//        Sample Output 0
//
//        Yes