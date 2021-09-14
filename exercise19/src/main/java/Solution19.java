/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode
* Import proper utilities
* Create BMI class
* Create BMI calc method
*       BMI = (weight / (height × height)) * 703
* Create bmi report method
*       If user BMI 18.5<x<25
*               Report user is in ideal category
*       If user BMI x>25
*               Report user is overweight
*       If user BMI x<18.5
*               Report user is underweight
* Create main class
* Prompt user for weight and height
* Save input to variables
* Call BMI calc method
* Call BMI report method */

import java.util.Scanner;

class BodyMassIndex {
    double bmiCalc(double height, double weight) {
        return (weight/(height*height))*703;
    }
    void bmiReport(double bmiVal) {
        if (bmiVal < 18.5) {
            System.out.printf("Your BMI value is %.1f.%nYou are underweight. You should see a doctor.", bmiVal);
        }
        else if (bmiVal > 25) {
            System.out.printf("Your BMI value is %.1f.%nYou are overweight. You should see a doctor.", bmiVal);
        }
        else {
            System.out.printf("Your BMI value is %.1f.%nYou are within the ideal weight range.", bmiVal);
        }
    }
}

public class Solution19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BodyMassIndex bmi = new BodyMassIndex();
        System.out.printf("Please enter your height, in inches:%n");
        double height = input.nextDouble();
        System.out.printf("Please enter your weight, in pounds:%n");
        double weight = input.nextDouble();
        double bmiVal = bmi.bmiCalc(height, weight);
        bmi.bmiReport(bmiVal);
    }
}
