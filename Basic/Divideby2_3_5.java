import java.util.Scanner;

//Link = https://www.hackerrank.com/contests/july22-beta-java-dsa-class-challenges/challenges/divide-n-by-2-3-5-and-tell-steps
public class Divideby2_3_5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = sc.nextInt();

        while (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
            if (n % 2 == 0) {
                n = n / 2;
                steps = steps + 2;
            } else if(n % 3 == 0) {
                n = n / 3;
                steps = steps + 3;
            } else {
                n = n / 5;
                steps = steps + 5;
            }
        }
        System.out.println(steps);
        System.out.println(n);
    }
}
