/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/*Pseudocode:
* Import proper utilities
* Create Retirement class for functional calculations
* Create retirement printing method
*           Save years until retirement and retirement year to variable
*           Use calendar to get current year
*           Print how many years left user has till retirement
*           Print current year and retirement year
* Create main class
* Save current year in variable using Calendar functionality
* Print prompt for current age
* Scan current age input
* Print prompt for retirement age goal
* Scan retirement age goal
* Call on retirement printing method*/

import java.util.Scanner;
import java.util.Calendar;

class Retirement {
    public void reitrePrint(int targetAge, int currentAge){
        int yearsTillRetire = targetAge - currentAge;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int retirementYear = currentYear + yearsTillRetire;
        System.out.printf("You have %d years until you can retire%n", yearsTillRetire);
        System.out.printf("It is currently %d, you can retire in %d", currentYear, retirementYear);
    }
}

public class Solution06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Retirement retire = new Retirement();
        System.out.printf("What is your current age?%n");
        int userAge = input.nextInt();
        System.out.printf("At what age would you like to retire?%n");
        int userRetireAge = input.nextInt();
        retire.reitrePrint(userRetireAge, userAge);
    }
}
