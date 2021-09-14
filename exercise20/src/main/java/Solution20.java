/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode
//Code from exercise 14 can be repurposed into this exercise
* Import proper utilities
* Create class for Tax calculation
* Create methods for Wisconsin tax calculation (Tax calc and string generation
*    If Entered state abbreviation is WI
*          Calculate base WI tax
*          Prompt user for what county they live in
                If Eau Claire
                    Calculate additional tax
                If Dunn
                    Calculate additional tax
*          Return string of subtotal and tax total
*          Return total price, subtotal + tax
*   Create method for Illinois tax calculation
If Entered state abbreviation is WI
*          Calculate base IL tax
*          Print subtotal amount
*          Print tax amount
*          Return total price, subtotal + tax
* Create main class
* Prompt user for order price
* Save user input to order variable
* Prompt user for state abbreviation
* Save user input to
* Call Wisconsin tax Calc
* Call Illinois tax Calc
* Print total price*/

import java.util.Objects;
import java.util.Scanner;

class TaxCalc {
    private static final double WI_TAX = 0.05;
    private static final double EAU_TAX = 0.005;
    private static final double DUNN_TAX = 0.004;
    private static final double IL_TAX = 0.08;
    public static final String WI = "Wisconsin"; //Created to according to SonarLint's guides
    public static final String IL = "Illinois";
    private static final String SUB_IS = "Your subtotal is: $";
    private static final String TAX_IS = "\nYour tax total is: $";

    public String wiTaxPrint(String userState, String userCounty, double order) {
        if (Objects.equals(userState, WI)) {
            double tax = (Math.ceil((order * WI_TAX)*100) / 100);
            if (Objects.equals(userCounty, "Eau")) {
                tax = tax + (Math.ceil((order * EAU_TAX)*100) / 100);
                return SUB_IS + (Math.ceil(order*100) / 100) + TAX_IS + tax + "\n";
            } else if (Objects.equals(userCounty, "Dunn")) {
                tax = tax + (Math.ceil((order * DUNN_TAX)*100) / 100);
                return SUB_IS + (Math.ceil(order*100) / 100) + TAX_IS + tax + "\n";
            }
            return SUB_IS + (Math.ceil(order*100) / 100) + TAX_IS + tax + "\n";
        }
        return "";
    }

    public double taxAmt(String userState, String userCounty, double order) {
        double tax = 0;
        if (Objects.equals(userState, WI)) {
            tax = (Math.ceil((order * WI_TAX)*100) / 100);
            if (Objects.equals(userCounty, "Eau")) {
                tax = tax + (Math.ceil((order * EAU_TAX)*100) / 100);
            } else if (Objects.equals(userCounty, "Dunn")) {
                tax = tax + (Math.ceil((order * DUNN_TAX)*100) / 100);
            }
        }
        else if (Objects.equals(userState, IL)) {
            tax = (Math.ceil((order * IL_TAX)*100) / 100);
        }
        return tax+order;
    }

    public String ilTaxPrint(String userState, double order) {
        if (Objects.equals(userState, IL)) {
            double tax = (Math.ceil(order*100) / 100) * IL_TAX;
            return SUB_IS + order + TAX_IS  + tax + "\n";
        }
        return "";
    }
}

public class Solution20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        TaxCalc tax = new TaxCalc();
        String taxResult = "";
        System.out.printf("Enter your order price:%n");
        double subtotal = input.nextDouble();
        subtotal = (Math.ceil(subtotal * 100) / 100);
        System.out.printf("Enter your state:%n");
        String state = input.next();
        String county = "";
        if (Objects.equals(state, TaxCalc.WI)) {
            System.out.printf("Enter your county:%n");
            county = input.next();
            taxResult = tax.wiTaxPrint(state, county, subtotal);
        }
        if (Objects.equals(state, TaxCalc.IL)) {
            taxResult = tax.ilTaxPrint(state, subtotal);
        }
        double totalVal = tax.taxAmt(state, county, subtotal);
        System.out.printf("%sYour total is $%.2f", taxResult, totalVal);
    }
}

