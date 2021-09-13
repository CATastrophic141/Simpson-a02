/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/* Pseudocode:
//NOTE: Code from example 12 can be modified into this example
* Import proper utilities
* Create class for calculating interest
* Create method for determining compound interest
* Ensure that cents are rounded up using Math.ceil (Math.ceil(temp * 100) / 100)
* Create main class
* Prompt user for principal, save input to principal variable
* Prompt user for interest rate, save input to rate variable
* Prompt user for number of years, save input to years variable
* Prompt user for number of compounds, save input to compound variable
* Call on compound interest function
* Print out result */

import java.util.Scanner;

class Interest {
    public double interestCalc (double principal, double rate, int compound, double years) {
        rate = rate / 100;
        double base = (1 + (rate/compound));
        double exponent = years * compound;
        double worth = principal*(Math.pow(base, exponent));
        worth = (Math.ceil(worth * 100) / 100);
        return worth;
    }
}

public class Solution13 {
    public static void main(String[] args) {
        //For sake of using exponents, and given compounds happen over a year, program is not tolerant of non-integer years
        Interest invest = new Interest();
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the principal amount:%n");
        double principal = input.nextDouble();
        System.out.printf("Enter the rate of interest:%n");
        double rate = input.nextDouble();
        System.out.printf("Enter the number of years:%n");
        int years = input.nextInt();
        System.out.printf("Enter the number of times the interest will be compounded per year:%n");
        int compound = input.nextInt();
        double finalAmt = invest.interestCalc(principal, rate, compound, years);
        System.out.printf("A principal amount of $%.2f will be worth $%.2f after %d years compounded %d times a year, given an interest rate of %%%.2f (%.4f)."
                , (Math.ceil(principal*100)/100), finalAmt, years, compound, rate, rate/100);
    }
}
