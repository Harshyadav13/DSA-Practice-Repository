package com.luv2code.springcoredemo;

import java.util.*;

public class Practice1 {
    public static ArrayList<String> goo(String str) {
        //base case
        if(str.equals("") == true) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        String remstring = str.substring(1);
        ArrayList<String> sres = goo(remstring);
        ArrayList<String> res = new ArrayList<>();

        for(String s: sres) {
            //Append " "
            res.add("" + s);
        }
        for(String s: sres) {
            //Append first character
            res.add(str.charAt(0) + s);
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string please");
        String str = sc.nextLine();

        ArrayList<String> res = goo(str);
        System.out.println(res);
    }
}
