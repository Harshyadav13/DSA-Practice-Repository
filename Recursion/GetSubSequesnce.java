import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequesnce {
    public static ArrayList<String> gss(String input) {
        if(input.length() == 0) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }


        ArrayList<String> tres = gss(input.substring(1));
        ArrayList<String> res = new ArrayList<>();

        for(String s : tres) {
            res.add("" + s);
        }

        for(String s : tres) {
            res.add(input.charAt(0) + s);
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayList<String> res = gss(input);
        System.out.println(res);
    }
}
