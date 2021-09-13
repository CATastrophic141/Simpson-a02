/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
//(Math.ceil(temp*100)/100)
/* Pseudocode
* Import proper utilities
* Create class for Tax calculation
* Create method for Wisconsin tax calculation
*    If Entered state abbreviation is WI
*          Calculate WI tax
*          Print subtotal amount
*          Print tax amount
*          Return total price, subtotal + tax
* Create main class
* Prompt user for order price
* Save user input to order variable
* Call upon Wisconsin tax Calc
* Print total price
* */

import java.util.Objects;
import java.util.Scanner;

class TaxCalc {
    private static final double WI_TAX = 0.055;
    public void wiTaxPrint(String userState, double order) {
        if(Objects.equals(userState, "WI")) {
            System.out.printf("Your subtotal is: $%.2f:%n", order);
            double tax = (Math.ceil(order * 100) / 100) * WI_TAX;
            System.out.printf("The tax amount is $%.2f:%n", tax);

        }
    }
    public double wiTaxAmt (String userState, double order){
        double tax = 0;
        if(Objects.equals(userState, "WI"))
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
    tax.wiTaxPrint(state, subtotal);
    double totalVal = tax.wiTaxAmt(state, subtotal);
    System.out.printf("Your total is $%.2f", totalVal);
    }
}
