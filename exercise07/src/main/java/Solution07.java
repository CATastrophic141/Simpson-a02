/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/* Pseudocode:
Import proper files for functionality
Create class for unit conversion
Create class for area calculation
Create main class
Prompt user to enter first measurement in feet
Save user input to variable feetMeas1
Prompt user to enter second measurement in feet
Save user input to variable feetMeas2
Confirm input to user with print statement
Use unit conversion function to convert feetMeas1 and feetMeas2 to meters
Save output from conversion function into variables meterMeas1 and meterMeas2 respectively
Use area calculation function to calculate area in feet and meters
Print out area in feet and meters using printf
* */

import java.util.Scanner;

class UnitConversion {
    private static final double CONVERSION_FACTOR = 0.09290304;
    public double feetToMeter(double feetMeasurement){
        return feetMeasurement * CONVERSION_FACTOR;
    }
}

class AreaCalculator {
    public double areaFeet(double feetMeas1, double feetMeas2){
        return feetMeas1 * feetMeas2;
    }
    public double areaMeter(double meterMeas1, double meterMeas2){
        return meterMeas1 * meterMeas2;
    }
}

public class Solution07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter the length of the measurement in feet:%n");
        double feetMeas1 = input.nextDouble();
        System.out.printf("Please enter the width of the measurement in feet:%n");
        double feetMeas2 = input.nextDouble();
        System.out.printf("You have entered the dimensions of: %.2f feet by %.2f feet.%n", feetMeas1, feetMeas2);
        UnitConversion unitConv = new UnitConversion();
        AreaCalculator areaCalc = new AreaCalculator();
        double meterMeas1 = unitConv.feetToMeter(feetMeas1);
        double meterMeas2 = unitConv.feetToMeter(feetMeas2);
        double areaInFeet = areaCalc.areaFeet(feetMeas1, feetMeas2);
        double areaInMeter = areaCalc.areaMeter(meterMeas1, meterMeas2);
        System.out.printf("The area is:%n");
        System.out.printf("%.2f (feet)%n", areaInFeet);
        System.out.printf("%.2f (meters)%n", areaInMeter);
    }
}
