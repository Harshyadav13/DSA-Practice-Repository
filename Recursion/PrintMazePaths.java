import java.util.Scanner;

public class PrintMazePaths {

    public static void  printMaze(int row, int col, int destRow, int destCol, String output) {

            if(row == destRow && col == destCol) {
                System.out.println(output + " ");
                return;
            }

        if(row > destRow || col > destCol) {
            return;
        }

        //Horizontal
        printMaze(row ,  col + 1,  destRow,  destCol,  output+"h");

        //vertical
        printMaze(row + 1,  col ,  destRow,  destCol,  output +"v");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  m = sc.nextInt();

        printMaze(0, 0, n-1, m-1, "");
    }
}
