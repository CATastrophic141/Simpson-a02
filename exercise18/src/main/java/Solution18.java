/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode
* Import proper utilities
* Create TempConverter class
* Create Celsius to Fahrenheit method
* Create Fahrenheit to Celsius method
* Create main class
* If user enters C
*       Use Fahrenheit to Celsius method, save result to tempResult variable
*       Save Fahrenheit to tempType1 string
*       Save Celsius to tempType2 string
* If user enter F
*       Use Celsius to Fahrenheit method, save result to tempResult variable
*       Save Celsius to tempType1 string
*       Save Fahrenheit to tempType2 string
* Print out result statement using tempResult, tempType1, and tempType2 */

import java.util.Scanner;

class TempConverter {
    Scanner input = new Scanner(System.in);
    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    double fahrenheitPrompt() {
        System.out.printf("You chose F%n");
        System.out.printf("Please enter the temperature in Celsius%n");
        return input.nextDouble();
    }
    double celsiusPrompt() {
        System.out.printf("You chose C%n");
        System.out.printf("Please enter the temperature in Fahrenheit%n");
        return input.nextDouble();
    }
}

public class Solution18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TempConverter temp = new TempConverter();
        System.out.printf("Enter C to convert from Fahrenheit to Celsius%nor press F to convert from Celsius to Fahrenheit.%n");
        String userIn = input.nextLine();
        String tempType1 = "Null";
        String tempType2 = "Null";
        double temperature = 0;
        if (userIn.equals("F")||userIn.equals("f")) {
            double fahrenheit = temp.fahrenheitPrompt();
            tempType1 = "Celsius";
            tempType2 = "Fahrenheit";
            temperature = temp.celsiusToFahrenheit(fahrenheit);
        }
        else if (userIn.equals("C")||userIn.equals("c")){
            double celsius = temp.celsiusPrompt();
            tempType1 = "Fahrenheit";
            tempType2 = "Celsius";
            temperature = temp.fahrenheitToCelsius(celsius);
        }
        else {
            System.out.print("Please enter a proper response.");
            System.exit(0);
        }
        System.out.printf("Converting from %s to %s, the temperature is %.2f", tempType1, tempType2, temperature);
    }
}
