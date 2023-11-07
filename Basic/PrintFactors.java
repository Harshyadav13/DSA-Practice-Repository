import java.util.Scanner;

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

//    Take a whole number N as an integer input and print all the factors of it such that each factor should be printed in a separate line.
//
//        Input Format
//
//    N will be given as an integer input.
//
//        Constraints
//
//        0 <= N <= 2^31-1
//        Output Format
//
//        Print all the factors of the number where each factor should be printed in a separate line.
//
//        Sample Input 0
//
//        12
//        Sample Output 0
//
//        1
//        2
//        3
//        4
//        6
//        12
//        Sample Input 1
//
//        30