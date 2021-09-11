/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode:
* Import proper utilities
* Create CurrencyConversion class
* Create method for euroToUSD, multiplying a given amount of euros by an exchange rate
* Create method for conversion, prompting user for the amount of euros, performing conversion, and then printing the result.
*           This method will call euroToUSD
*           This method with use the math ceiling function to round fractions of cents up
* Create main function
* Call conversion method*/

import java.util.Scanner;

class CurrencyConversion {
    Scanner input = new Scanner(System.in);
    double euroToUSD(double numEuro, double convRate) {
        return numEuro * convRate;
    }

    void conversion() {
        System.out.printf("Enter the amount of Euros:%n");
        double numEuro = input.nextDouble();
        System.out.printf("Enter the conversion rate:%n");
        double convRate = input.nextDouble();
        double temp = euroToUSD(numEuro, convRate);
        double finalAmt = Math.ceil(temp * 100) / 100;
        System.out.printf("%.3f euros will convert to %.2f USD at an exchange rate at %.4f", numEuro, finalAmt, convRate);
    }
}
    //This exercise was used to practice nested methods within a class
public class Solution11 {
    public static void main(String[] args){
        CurrencyConversion conv = new CurrencyConversion();
        conv.conversion();
    }
}
