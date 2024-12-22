import java.util.Scanner;

public class PrintPermutations {
    public static void printPermutation(String input, String output) {

        if(input.length() == 0) {
            System.out.println(output);
            return;
        }

        for(int i = 0; i < input.length(); i++) {
            char choice = input.charAt(i);
            String newInput = input.substring(0, i) + input.substring(i + 1);
            printPermutation(newInput, output + choice);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";

        printPermutation(input, output);
    }
}
