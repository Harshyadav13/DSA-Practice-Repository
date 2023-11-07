package array;

import java.util.Scanner;

public class isIdenticalArray {

    public static boolean isIdentical(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) return false;

        for(int idx = 0; idx < arr1.length; idx++) {
            if(arr1[idx] != arr2[idx]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean res = isIdentical(arr1, arr2);
        System.out.println(res);
    }
}

//    Take a whole number N as an integer input and then print all the unique prime factors of N such that each prime factor is printed in a separate line.
//
//        Input Format
//
//        Input contains an integer N.
//
//        Constraints
//
//        1 <= N <= 2^31-1
//        Output Format
//
//        Print the prime factors as an integer value where each prime number should be printed in a separate line.
//
//        Sample Input 0
//
//        45
//        Sample Output 0
//
//        3
//        5