/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode:
 * Import proper utilities
 * Create Month class
 * Create num to month method
 *     Create switch statement
 *           Create a case for each corresponding number 1-12
 *           Create string of corresponding month name
 * Create main class
 * Prompt user for month number
 * Save input to monthNum variable
 * If monthNum == 1-12
 *           Call num to month method
 * Else
 *           Print "enter a valid number, 1-12"
 * */

import java.util.Scanner;

class MonthConv {
    public void numToMonth(int monthNum) {
        switch (monthNum) {
            case 1 -> System.out.print("The month is January");
            case 2 -> System.out.print("The month is February");
            case 3 -> System.out.print("The month is March");
            case 4 -> System.out.print("The month is April");
            case 5 -> System.out.print("The month is May");
            case 6 -> System.out.print("The month is June");
            case 7 -> System.out.print("The month is July");
            case 8 -> System.out.print("The month is August");
            case 9 -> System.out.print("The month is September");
            case 10 -> System.out.print("The month is October");
            case 11 -> System.out.print("The month is November");
            case 12 -> System.out.print("The month is December");
            default -> System.exit(-1);
        }
    }
}

public class Solution21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the month number:%n");
        MonthConv mConv = new MonthConv();
        int monthNum = input.nextInt();
        if ((monthNum<1)||(monthNum>12)){
            System.out.print("Please enter a valid number.");
        }
        else {
            mConv.numToMonth(monthNum);
        }
    }
}
