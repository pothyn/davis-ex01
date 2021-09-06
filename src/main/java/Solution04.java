/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hunter Davis
 */
import java.util.Scanner;

public class Solution04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        Enter a noun: dog
//        Enter a verb: walk
//        Enter an adjective: blue
//        Enter an adverb: quickly
//        Do you walk your blue dog quickly? That's hilarious!

        System.out.print("Enter a noun: ");
        String noun = in.next();

        System.out.print("Enter a verb: ");
        String verb = in.next();

        System.out.print("Enter an adjective: ");
        String adj = in.next();

        System.out.print("Enter a adverb: ");
        String adv = in.next();

        System.out.printf("\nDo you %s your %s %s %s? That's hilarious!\n", verb, adj, noun, adv);

    }

}
