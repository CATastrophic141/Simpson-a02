/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

//(Math.ceil(temp*100)/100)
/* Pseudocode
* Import proper utilities
* Create class for Tax calculation
* Create methods for Wisconsin tax calculation (Calc and string generation)
*    If Entered state abbreviation is WI
*          Calculate WI tax
*          Return string of subtotal and tax amount
*          Return total price, subtotal + tax
* Create main class
* Prompt user for order price
* Prompt user for state
* Save user input to order variable
* Call upon Wisconsin tax calc method
* Call upon Wisconsin tax string method
* Print total price */

import java.util.Objects;
import java.util.Scanner;

class TaxCalc {
    private static final double WI_TAX = 0.055;
    public String wiTaxPrint(String userState, double order) {
        if(Objects.equals(userState, "Wisconsin")) {
            double tax = (Math.ceil(order * 100) / 100) * WI_TAX;
            return "Your subtotal is: $" + order + "\nThe tax amount is: $" + tax + "\n";
        }
        return "";
    }
    public double wiTaxAmt (String userState, double order){
        double tax = 0;
        if(Objects.equals(userState, "Wisconsin"))
            tax = (Math.ceil(order * 100) / 100) * WI_TAX;
        return tax+order;
    }
}

public class Solution14 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    TaxCalc tax = new TaxCalc();
    System.out.printf("Enter your order price:%n");
    double subtotal = input.nextDouble();
    subtotal = (Math.ceil(subtotal * 100) / 100);
    System.out.printf("Enter your state:%n");
    String state = input.next();
    String wiTax= tax.wiTaxPrint(state, subtotal);
    double totalVal = tax.wiTaxAmt(state, subtotal);
    System.out.printf("%sYour total is $%.2f", wiTax, totalVal);
    }
}
