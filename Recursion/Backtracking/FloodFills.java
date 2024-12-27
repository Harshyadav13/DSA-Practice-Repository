package Backtracking;

import java.util.Scanner;

public class FloodFills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        boolean [][] visited = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                visited[i][j] = false;
            }
        }
        floodFills(arr, 0, 0, "", visited);

    }

    public static void floodFills(int[][] maze, int row, int col, String output, boolean[][] visited) {

        //negative condition
        if(row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || maze[row][col] == 1 || visited[row][col] == true) {
            return;
        }

        //positive condition
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(output + " ");
            return;
        }

        visited[row][col] = true;

        //top
        floodFills(maze, row - 1, col, output + "t", visited);

        //left
        floodFills(maze, row, col - 1, output + "l", visited);

        //down
        floodFills(maze, row + 1, col, output + "d", visited);

        //right
        floodFills(maze, row, col + 1, output + "r", visited);

        //backtracking step-> we r making it false because it should be false so that other possible answer can also visit all paths which are marked true
             visited[row][col] = false;
        }
    }
