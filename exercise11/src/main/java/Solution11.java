/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode:
* Import proper utilities
* Create CurrencyConversion class
* Create method for conversion, prompting user for the amount of euros, performing conversion, and then printing the result.
*           Call euroToUSD
*                   This method with use the math ceiling function to round fractions of cents up
*           Print result of conversion
* Create main function
* Prompt user for amount of euros
* Save input to variable
* Prompt user for conversion rate
* Save input to variable
* Call conversion method*/

import java.util.Scanner;

class CurrencyConversion {
    double euroToUSD(double numEuro, double convRate) {
        return numEuro * convRate;
    }

    void conversion(double euro, double convRate) {
        double temp = euroToUSD(euro, convRate);
        double finalAmt = Math.ceil(temp * 100) / 100;
        System.out.printf("%.3f euros will convert to %.2f USD at an exchange rate at %.4f", euro, finalAmt, convRate);
    }
}

public class Solution11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CurrencyConversion conv = new CurrencyConversion();
        System.out.printf("Enter the amount of Euros:%n");
        double numEuro = input.nextDouble();
        System.out.printf("Enter the conversion rate:%n");
        double convRate = input.nextDouble();
        conv.conversion(numEuro, convRate);
    }
}
