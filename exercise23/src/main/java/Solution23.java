/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rylan Simpson
 */

/*Pseudocode
* Import proper utilities
* Create Troubleshoot class
* create carTroubleshoot method
* Use the following tree to ask questions and receive input
 (Is the car silent when you turn the key?) then (yes).
    (Are the battery terminals corroded?) then (yes)
        Clean terminals and try starting again.
        stop
    (no)
        Replace cables and try again.
        stop
    endif
(no)
    (Does the car make a slicking noise?) then (yes)
        Replace the battery.
        stop
    (no)
        (Does the car crank up but fail to start?) then (yes)
            Check spark plug connections.
            stop
        (no)
            (Does the engine start and then die?) then (yes)
                (Does you car have fuel injection?) then (yes)
                    Get it in for service.
                    stop
                (no)
                    Check to ensure the choke is opening and closing.
                    stop
                endif
            (no)
                This should not be possible.
                stop
            endif
        endif
    endif
endif
Return and print the resulting string*/

import java.util.Objects;
import java.util.Scanner;

class Troubleshoot {
    Scanner input = new Scanner(System.in);
    private static final String DEFAULT = "Please enter an appropriate response";

    private String level2part1(String userIn2) {
        if (Objects.equals(userIn2, "y")) {
            return "Clean the terminals and then try starting again.";
        } else if (Objects.equals(userIn2, "n")) {
            return "Replace the cables and try again.";
        }
        return DEFAULT;
    }

    private String level2part2(String userIn3) {
        if (Objects.equals(userIn3, "y")) {
            return "Replace the battery.";
        } else if (Objects.equals(userIn3, "n")) {
            System.out.print("Does the car crank up but fail to start? ");
            String userIn4 = input.nextLine();
            return level3(userIn4);
        }
        return DEFAULT;
    }

    private String level3(String userIn4) {
        if (Objects.equals(userIn4, "y")) {
            return "Check the spark plug connections";
        } else if (Objects.equals(userIn4, "n")) {
            System.out.print("Does the engine start and then die? ");
            String userIn5 = input.nextLine();
            if (Objects.equals(userIn5, "y")) {
                System.out.print("Does you car have fuel injection? ");
                String userIn6 = input.nextLine();
                if (Objects.equals(userIn6, "y")) {
                    return "Get your car in for service";
                } else if (Objects.equals(userIn6, "n")) {
                    return "Check to ensure the choke is opening and closing";
                }
            } else if (Objects.equals(userIn5, "n")) {
                    return "This should not be possible";
                }
            }
        return DEFAULT;
    }

    public String carTroubleshoot() {
        System.out.print("Is the car silent when you turn the key? ");
        String userIn1 = input.nextLine();
        if (Objects.equals(userIn1, "y")) {
            System.out.print("Are the battery terminals corroded? ");
            String userIn2 = input.nextLine();
            return level2part1(userIn2);
        } else if (Objects.equals(userIn1, "n")) {
            System.out.print("Does the car make a slicking noise? ");
            String userIn3 = input.nextLine();
            return level2part2(userIn3);
        }
        return DEFAULT;
    }
}

public class Solution23 {
    public static void main (String[] args) {
        Troubleshoot trouble = new Troubleshoot();
        System.out.printf("Welcome to the car troubleshooting assistance module. Please answer the questions with yes (\"y\") or no (\"n\")%n");
        String result = trouble.carTroubleshoot();
        System.out.print(result);
    }
}
