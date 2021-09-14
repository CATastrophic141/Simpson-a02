/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode
Import proper functionality
Create class for division,and modulus calculation functions
Create modulus method, use modulus operator to determine the remaining number of pizza slices
Create division method, use division calculator (int) to calculate the number of pizza slices per person
Create printing method, using other methods of the class
            Print confirmation of entered variables
            Print how many slices per person
            Print remaining slices
Create main class
Prompt user to enter the number of people
Save input to variable
Prompt user to enter the number of pizzas
Save input to variable
Prompt user to enter the number of slices per person
Save input to variable
Call on pizza printing method
 */

import java.util.Scanner;

class PizzaCalc {
    public int pizzaDivision(int people, int pizzaSlices) {
        return pizzaSlices/people;
    }
    public int pizzaRemainder(int people, int pizzaSlices){
        return pizzaSlices%people;
    }
    public void pizzaPrint(int people, int pizza, int pizzaSlices) {
        System.out.printf("There are %d people sharing %d pizzas (%d slices in total)%n", people, pizza, pizzaSlices);
        System.out.printf("Each person can have %d slices%n", pizzaDivision(people, pizzaSlices));
        System.out.printf("There will be %d remaining slices%n", pizzaRemainder(people, pizzaSlices));
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
        pCalc.pizzaPrint(numPeople, numPizza, numSlices);
    }
}
