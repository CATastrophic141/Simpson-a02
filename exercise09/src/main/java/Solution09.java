/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode
Import proper utilities
Create class for determining coverage of x gallons for y square feet
Create constant for gallon to square feet conversion (AREA_P_GALLON = 350)
Create method for finding the number of gallons needed for y square feet
Divide y square feet by conversion constant AREA_P_GALLON, save result to numGallon variable
Ensure result of division is truncated to an integer
If area mod AREA_P_GALLON is not 0, add 1 to numGallons
Create main class
Create scanner object
Create coverage object
Prompt user to enter area needed to be covered by paint
Call class and method
 */

import java.util.Scanner;

class CoverageCalc {
    private static final int AREA_P_GALLON = 350;
    public int gallonCalc(double areaToCover){
        double temp = areaToCover / AREA_P_GALLON;
        int gallons = (int) temp;
        if (areaToCover % AREA_P_GALLON != 0){
            gallons += 1;
        }
        return gallons;
    }
}

public class Solution09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CoverageCalc calc = new CoverageCalc();
        System.out.printf("Please enter how much area in square feet to cover%n");
        double area = input.nextDouble();
        int totGallons = calc.gallonCalc(area);
        System.out.printf("%d gallons of paint will be required to cover %.2f square feet", totGallons, area);
    }
}
