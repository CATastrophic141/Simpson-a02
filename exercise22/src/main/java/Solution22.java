/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode
* Import proper utilities
* Create NumCompare class
* Create threeNumComp method
*       Assign the three numbers to elements in an array
*       Perform for loop to find the highest number
*       Return highest element in the array
* Create main class*/

import java.util.Scanner;

class NumCompare{
    public double threeNumComp(double num1, double num2, double num3){
        double highestNum = 0;
        double[] arrComp = {num1, num2, num3};
        if (num1 == num2 && num1 == num3){
            System.out.print("All of the numbers are equal");
            System.exit(0);
        }
        for (int i = 0; i<3; i++){
            if (arrComp[i] >= highestNum)
                highestNum = arrComp[i];
        }
        return highestNum;
    }
}

public class Solution22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumCompare numComp = new NumCompare();
        System.out.printf("enter the first number:%n");
        double num1 = input.nextDouble();
        System.out.printf("enter the second number:%n");
        double num2 = input.nextDouble();
        System.out.printf("enter the third number:%n");
        double num3 = input.nextDouble();
        double highNum = numComp.threeNumComp(num1, num2, num3);
        System.out.printf("The highest number is %f", highNum);
    }
}
