/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hunter Davis
 */

import java.util.Scanner;

public class example02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.nextLine();

        System.out.println(str+" has "+str.length());
    }
}
