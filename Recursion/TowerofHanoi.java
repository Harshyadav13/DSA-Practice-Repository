import java.util.Scanner;

//Link = https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/toh-official/ojquestion
public class TowerofHanoi {

    public static void toh(int n, int t1, int t2, int t3) {
        if(n == 0) return;

        //Faith n-1 disk from t1 to t3 using t2
        toh(n-1, t1, t3, t2);

        //Move nth disk from t1 to t3
        System.out.println(n + "[" + t1 + "->" + t2 + "]");

        //Move n-1 disk from t3 to t2 using t1
        toh(n-1, t3, t2, t1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();

        toh(n, t1, t2, t3);
    }
}
