import java.util.Scanner;

public class printEncoding {

    public static void printEncoding(String input, String output) {

        if(input.length() == 0) {
            System.out.println(output);
            return;
        }

        //for 1 character
        char ch1 = input.charAt(0);
        if (ch1 >= '1' && ch1 <= '9')
            printEncoding(input.substring(1), output + (char) (ch1 - '0' + 96));

        //for 2 characters
        if (input.length() > 1) {
            String ch2 = input.substring(0, 2);
            int ch2Int = Integer.parseInt(ch2);
            if(ch2Int >= 10 && ch2Int <= 26)
             printEncoding(input.substring(2), output + (char) (ch2Int + 96));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";

        printEncoding(input, output);
    }
}
