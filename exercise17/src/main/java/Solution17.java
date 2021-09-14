/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/*Pseudocode
* Import proper functionality
* Create Class for BAC
* Create methods for driving ability check and blood alcohol level
* Calculate BAC
* Print whether it is legal for the user to drive or not
* Create methods for user prompts and input
* Prompt user for gender
* Save user input
* Prompt user for number of consumed ounces of alcohol
* Save user input
* Prompt user for weight
* Save user input
* Prompt user for hours since last drink
* Save user input
* Create main class
* Call user input methods
* Call on blood alcohol calc method
* Call on driving ability method */

import java.util.Scanner;

class DrunkDrivingCheck {
    static final String ERROR_MSG = "Please enter a valid response";
    
    double bloodAlcohol (int gender, double oz, double weight, double hours) {
        if (gender == 1) {
            double bacMen = (oz * 5.14 / weight * 0.73) - 0.015 * hours;
            System.out.printf("Your BAC content is %f%n", bacMen);
            return bacMen;
        }
        else {
            double bacWomen = (oz * 5.14 / weight * 0.66) - 0.015 * hours;
            System.out.printf("Your BAC content is %f%n", bacWomen);
            return bacWomen;
        }
    }

    void drivingCheck(double bloodAlcohol) {
        if (bloodAlcohol <= 0.08){
            System.out.print("It is legal for you to drive");
        }
        else {
            System.out.print("It is not legal for you to drive");
        }
    }

    int genderCheck() {
        Scanner input = new Scanner(System.in);
        System.out.printf("What is you gender? Enter 1 for male and 2 for female%n");
        while (true) {
            if (input.hasNextInt()) {
                return input.nextInt();
            }
            else {
                input.next();
            }
            System.out.println(ERROR_MSG);
        }
    }

    double ounceCheck() {
        Scanner input = new Scanner(System.in);
        System.out.printf("How many ounces of alcohol have you drink?%n");
        while (true) {
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                input.next();
            }
            System.out.println(ERROR_MSG);
        }
    }

    double weightCheck() {
        Scanner input = new Scanner(System.in);
        System.out.printf("What is your weight in pounds?%n");
        while (true) {
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                input.next();
            }
            System.out.println(ERROR_MSG);
        }
    }

    double hourCheck() {
        Scanner input = new Scanner(System.in);
        System.out.printf("How many hours has it been since your last drink?%n");
        while (true) {
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                input.next();
            }
            System.out.println(ERROR_MSG);
        }
    }
}

public class Solution17 {
    public static void main(String[] args) {
        DrunkDrivingCheck check = new DrunkDrivingCheck();
        int userGender = check.genderCheck();
        double ozAlcohol = check.ounceCheck();
        double weight = check.weightCheck();
        double hours = check.hourCheck();
        double bloodAlcLevel = check.bloodAlcohol(userGender, ozAlcohol, weight, hours);
        check.drivingCheck(bloodAlcLevel);
    }
}
