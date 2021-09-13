/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode
* Import proper functionality
* Create class for computing interest
* Create method for calculating simple interest, given interest rate, principal, and time in years
* Ensure that cents are rounded up using Math.ceil (Math.ceil(temp * 100) / 100)
* Create main class
* Prompt user for principal, save input to principal variable
* Prompt user for interest rate, save input to rate variable
* Prompt user for number of years, save input to years variable
* Call on simple interest function using saved variables
* Print out result*/

import java.util.Scanner;

class Interest {
    public double interestCalc (double principal, double rate, double years) {
        rate = rate / 100;
        double worth = principal * (1 + rate * years);
        worth = (Math.ceil(worth * 100) / 100);
        return worth;
    }
}

public class Solution12 {
    public static void main(String[] args) {
        //Program is tolerant of non-integer years of time
        Interest invest = new Interest();
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the principal amount:%n");
        double principal = input.nextDouble();
        System.out.printf("Enter the rate of interest:%n");
        double rate = input.nextDouble();
        System.out.printf("Enter the number of years:%n");
        double years = input.nextDouble();
        double finalAmt = invest.interestCalc(principal, rate, years);
        System.out.printf("After %.1f years at an investment rate of %%%.2f (%.4f), a principal of $%.2f will be worth $%.2f", years, rate, rate/100, (Math.ceil(principal*100)/100), finalAmt);
    }
}
