/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hunter Davis
 */
package baseline;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        // New scanner to take input
        Scanner in = new Scanner(System.in);

        // Prompt and read input
        System.out.print("Enter your name: ");
        String str = in.nextLine();

        // Print and return name
        System.out.println("Your name is " + str + ".");
    }
}
