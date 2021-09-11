/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/*Import proper utilities
* Create Checkout class for item entry, subtotal calculation and tax calculation methods
* Create tax rate constant
* For prompt item method, prompt user to enter item quantity,
*   Scan user input for item quantity
*   Prompt user for item price
*   Scan user input for item price
* For subtotal calculation, add together the number of items times their price for however many items are scanned
* For tax calculation, add subtotal times tax rate to subtotal
* Create main class
* Create scanner and Checkout object
* Prompt user to enter how many items will be entered (Will enter 3)
* Scan user input to numItems variable
* Loop for numItem times
*           call item method
* Call subtotal method
* Call tax calculation method
* Print out the subtotal, tax, and total price
*/

import java.util.Scanner;

class Checkout {
    public static final double TAX_RATE = 0.055;
    Scanner input = new Scanner(System.in);
    public void itemEntry(int numItems, int[] quantityArray, double[] priceArray) {
        int i;
        for (i = 0; i < numItems; i++){
            System.out.printf("Please enter the quantity of item %d;%n", i+1);
            quantityArray[i] = input.nextInt();
            System.out.printf("Please enter the price of item %d:%n", i+1);
            priceArray[i] = input.nextInt();
        }
    }
    public double subtotalCalc(int numItems, int[] quantityArray, double[] priceArray) {
        int i;
        double subTotal = 0;
        for (i = 0; i < numItems; i++) {
                subTotal = subTotal + quantityArray[i]*priceArray[i];
        }
        return subTotal;
    }
    public double taxCalc(double subTotal) {
        return subTotal + subTotal*TAX_RATE;
    }
}

public class Solution10 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Checkout checkout = new Checkout();
            System.out.printf("Enter how many items you are checking out:%n");
            int numItems = input.nextInt();
            int[] itemQuantity = new int[numItems];
            double[] itemPrice = new double[numItems];
            checkout.itemEntry(numItems, itemQuantity, itemPrice);
            double subTotal = checkout.subtotalCalc(numItems, itemQuantity, itemPrice);
            double finalTotal = checkout.taxCalc(subTotal);
            System.out.printf("Your subtotal is: $%.2f%n", subTotal);
            System.out.printf("Total tax is: $%.2f%n", subTotal*Checkout.TAX_RATE);
            System.out.printf("The total price is: $%.2f%n", finalTotal);
    }
}
