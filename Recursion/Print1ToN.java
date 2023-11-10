//Link = https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

import java.util.Scanner;

public class Print1ToN {

    public static void  printIncreasing(int n) {
        if(n == 0) return;

        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
