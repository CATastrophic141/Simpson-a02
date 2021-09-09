/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/*Pseudocode:
* Import proper files: Calendar and Scanner
* Create Retirement class for functional calculations
* Create retirement age calculator method
* Use two user-input variables for a target age and current age for calculating years until retirement
* Subtract the two values for proper calculation
* return a value of years until retirement
* Create retirement year calculator method
* Use years until retirement method from retirement age calculator method
* Use Calendar functionality to get the current year
* Return the current year and years until retirement, added
* Create main class
* Create scanner object
* Save current year in variable using Calendar functionality
* Print prompt for current age
* Scan current age input
* Print prompt for retirement age goal
* Scan retirement age goal
* Call retirement age calculator and save value to ageRetire variable
* Call retirement year calculator and save value to yearRetire variable
* Print how many years left user has till retirement using ageRetire varaible
* Print current year and retirement year using current year variable and yearRetire variable*/

import java.util.Scanner;
import java.util.Calendar;

class Retirement {
    public int retireAgeCalc(int targetAge, int currentAge){
        int yearsTillRetire;
        yearsTillRetire = targetAge - currentAge;
     return yearsTillRetire;
    }
    public int retireYearCalc(int yearsTillRetire) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return (currentYear + yearsTillRetire);
    }
}

public class Solution06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Retirement retire = new Retirement();
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.printf("What is your current age?%n");
        int userAge = input.nextInt();
        System.out.printf("At what age would you like to retire?%n");
        int userRetireAge = input.nextInt();
        int yearTillRetire = retire.retireAgeCalc(userRetireAge, userAge);
        int retireYear = retire.retireYearCalc(yearTillRetire);
        System.out.printf("You have %d years until you can retire%n", yearTillRetire);
        System.out.printf("It is currently %d, you can retire in %d",currYear,retireYear);

    }
}
