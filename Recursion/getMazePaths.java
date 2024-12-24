package com.social.controller;

import java.util.ArrayList;
import java.util.Scanner;

public class getMazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> res = getMazePaths(0, 0, n-1, m-1);
        System.out.println(res);
    }

    public static ArrayList<String> getMazePaths(int srcRow, int srcCol, int destRow, int destCol) {

        if(srcRow == destRow && srcCol == destCol) {
            ArrayList<String> paths = new ArrayList<>();
            paths.add("");
            return paths;
        }

        else if(srcRow > destRow || srcCol > destCol) {
            ArrayList<String> paths = new ArrayList<>();
            return paths;
        }

        ArrayList<String> vPaths = getMazePaths(srcRow + 1, srcCol, destRow, destCol);
        ArrayList<String> hpaths = getMazePaths(srcRow, srcCol + 1, destRow, destCol);

        ArrayList<String> res = new ArrayList<>();

        for(String s : hpaths)
            res.add("h" + s);

        for(String s : vPaths)
            res.add("v" + s);

        return res;
    }
}
