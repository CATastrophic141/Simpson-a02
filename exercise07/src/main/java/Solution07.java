/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode:
Import proper files for functionality
Create class for area calculation
Create methods for calculating area in feet and meter
Create method for printing result, using class's area calc methods
            Print entered dimensions
            Print area in feet
            Print area in meters
Create main class
Prompt user to enter first measurement in feet
Save user input to variable feetMeas1
Prompt user to enter second measurement in feet
Save user input to variable feetMeas2
Call on area print method
* */

import java.util.Scanner;

class AreaMath {
    private static final double SQUARE_CONVERSION_FACTOR = 0.09290304;

    public double areaFeet(double feetMeas1, double feetMeas2){
        return feetMeas1 * feetMeas2;
    }
    public double areaMeter(double feetMeas1, double feetMeas2){
        return (feetMeas1 * feetMeas2)*SQUARE_CONVERSION_FACTOR;
    }
    public void printArea(double feetMeas1, double feetMeas2) {
        System.out.printf("You have entered the dimensions of: %.2f feet by %.2f feet.%n", feetMeas1, feetMeas2);
        System.out.printf("The area is:%n");
        System.out.printf("%.3f in square feet%n", areaFeet(feetMeas1, feetMeas2));
        System.out.printf("%.3f in square meters%n", areaMeter(feetMeas1, feetMeas2));
    }
}

public class Solution07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AreaMath area = new AreaMath();
        System.out.printf("Please enter the length of the measurement in feet:%n");
        double feetMeas1 = input.nextDouble();
        System.out.printf("Please enter the width of the measurement in feet:%n");
        double feetMeas2 = input.nextDouble();
        area.printArea(feetMeas1, feetMeas2);
    }
}
