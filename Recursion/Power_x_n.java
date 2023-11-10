
//Link = https://leetcode.com/problems/powx-n/
//lvl 2 1st Video

import java.util.Scanner;

public class Power_x_n {
    public static double power(double x,int n) {
        if(n == 0) return 1.0; //something raise to power zero is 1

        double tmp  = power(x, n / 2);
        if(n % 2 == 0) {
            return tmp * tmp;
        } else {
            return tmp * tmp * x;
        }
    }
    public static double myPow(double x, int n) {
        if(n < 0) {
            double tmp = power(x, -n);
            return 1.0 / tmp;
        }
        return power(x, n);
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();
            int n = sc.nextInt();

        System.out.println(myPow(x, n));
    }
}
