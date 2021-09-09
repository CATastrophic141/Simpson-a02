/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

/*Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole number instead of a decimal.

Write a program to evenly divide pizzas.
Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
Ensure that the number of pieces comes out even.
Display the number of pieces of pizza each person should get.
If there are leftovers, show the number of leftover pieces.*/

/* Pseudocode
Import proper functionality
Create class for division,and modulus calculation functions
Use modulus operator to determine the remaining number of pizza slices
User division calculator (int) to calculate the number of pizza slices per person
Create main class
create scanner object
create pizzaCalc object
Prompt user to enter the number of people
Prompt user to enter the number of pizzas
Prompt user to enter the number of slices per person
Print confirmation of the number of people and pizza slices
Call method to divide number of pizza slices by number of people
Call method to modulus number of pizza slices by number of people
Print the number of slices per person
Print the number of remaining pizzas
 */

import java.util.Scanner;

class PizzaCalc {
    public int pizzaDivision(int people, int pizzaSlices) {
        return pizzaSlices/people;
    }
    public int pizzaRemainder(int people, int pizzaSlices){
        return pizzaSlices%people;
    }
}

public class Solution08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        PizzaCalc pCalc = new PizzaCalc();
        System.out.printf("How many people are sharing pizza?%n");
        int numPeople = input.nextInt();
        System.out.printf("How many pizzas are there to share?%n");
        int numPizza = input.nextInt();
        System.out.printf("How many slices of pizza per person?%n");
        int numSlices = numPizza * input.nextInt();
        int numPerPerson = pCalc.pizzaDivision(numPeople, numSlices);
        int remainingSlices = pCalc.pizzaRemainder(numPeople, numSlices);
        System.out.printf("There are %d people sharing %d pizzas (%d slices in total)%n", numPeople, numPizza, numSlices);
        System.out.printf("Each person can have %d slices%n",numPerPerson);
        System.out.printf("There will be %d remaining slices%n",remainingSlices);
    }
}
