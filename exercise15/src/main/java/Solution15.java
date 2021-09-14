/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/* Pseudocode
* Import proper functionality
* Create class for login
* Create method for password matching
       If user input string matches set password,
            print "Welcome!"
       Else, print "I don't know you"
* Create main class
* Prompt user for username and password
* Call password comparison method */

import java.util.Objects;
import java.util.Scanner;

class Login {
    public void passwordMatch(String userIn, String setPass) {
        if(Objects.equals(userIn, setPass)) {
            System.out.print("Welcome!");
        }
        else {
            System.out.print("I don't know you.");
        }
    }
}

public class Solution15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Login login = new Login();
        String setPassword = "Pass123";
        System.out.printf("What is the password?%n");
        String userIn = input.nextLine();
        login.passwordMatch(userIn, setPassword);
    }
}
