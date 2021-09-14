/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode:
//NOTE: Code from example 12 can be modified into this example
* Import proper utilities
* Create class for calculating interest
* Create method for determining compound interest
* Ensure that cents are rounded up using Math.ceil (Math.ceil(temp * 100) / 100)
* Create method for printing results using value returned from other method within class
* Create main class
* Prompt user for principal, save input to principal variable
* Prompt user for interest rate, save input to rate variable
* Prompt user for number of years, save input to years variable
* Prompt user for number of compounds, save input to compound variable
* Call on result printing method */

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
    public void interestPrint(double principal, double rate, int compound, int years) {
        double finalAmt = interestCalc(principal, rate, compound, years);
        System.out.printf("$%.2f invested at %%%.2f for %d years compounded %d times per year is $%.2f",
                principal, rate, years, compound, finalAmt);
    }
}

public class Solution13 {
    public static void main(String[] args) {
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
        invest.interestPrint(principal, rate, compound, years);
    }
}
