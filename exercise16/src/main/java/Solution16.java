/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode
* Import proper functionality
* Create class for Age verification
* Create method for driving age
*       If user input is greater that or equal to 16,
*           Print "You are old enough to legally drive"
*           Else "You are not old enough to legally drive
*           Use ternary operators
* Create main class
* Prompt user for age
* Scan user age and save input to age variable
* Call driving age method
 */

import java.util.Scanner;

class AgeVerify {
    String drivingAge (int age) {
        return (age >= 16) ? "You are old enough to legally drive" : "You are not old enough to legally drive";
    }
}

public class Solution16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AgeVerify verifyAge = new AgeVerify();
        System.out.printf("Please enter your age:%n");
        int age = input.nextInt();
        String result = verifyAge.drivingAge(age);
        System.out.print(result);

    }
}
