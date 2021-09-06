/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hunter Davis
 */
import java.util.Scanner;

public class example05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        What is the first number? 10
//        What is the second number? 5
//        10 + 5 = 15
//        10 - 5 = 5
//        10 * 5 = 50
//        10 / 5 = 2

        System.out.print("What is the first number? ");
        String firstString = in.next();

        System.out.print("What is the second number? ");
        String secondString = in.next();

        int firstInt = Integer.parseInt(firstString);
        int secondInt = Integer.parseInt(secondString);

        System.out.printf("\n%d + %d = %d\n", firstInt, secondInt, firstInt + secondInt);
        System.out.printf("%d - %d = %d\n", firstInt, secondInt, firstInt - secondInt);
        System.out.printf("%d * %d = %d\n", firstInt, secondInt, firstInt * secondInt);
        System.out.printf("%d / %d = %d\n", firstInt, secondInt, firstInt / secondInt);

    }

}
