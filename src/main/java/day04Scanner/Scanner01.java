package day04Scanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //Example 1: Get the initial of a name which contains first name and last name
        //         Tom Hanks ==> TH

        Scanner input=new Scanner(System.in);


       // ("Enter your name and last name, please");

        String fullName = input.nextLine();   // Tom Hanks

        char first= fullName.charAt(0);
        char last= fullName.split(" ")[1].charAt(0);
        System.out.println(first + " " +last);


    }



}